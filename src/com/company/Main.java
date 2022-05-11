package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /* Здравствуйте Нургазы! Я немного сделал по своему, представил
    что делаю сайт где составляются пары */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Здравствуйте! Вы находитесь на сайте по составлению пар");
        System.out.println("Пожалуйста введите 5 мужских имен");
        String a0 = scan.nextLine();
        String a1 = scan.nextLine();
        String a2 = scan.nextLine();
        String a3 = scan.nextLine();
        String a4 = scan.nextLine();

        ArrayList<String> men = new ArrayList<>(5);
        men.add(a0);
        men.add(a1);
        men.add(a2);
        men.add(a3);
        men.add(a4);
        System.out.println("Отлично, Вот что вышло:" + men);

        System.out.println("-----------");

        System.out.println("Теперь введите 5 женских имен");
        String b0 = scan.nextLine();
        String b1 = scan.nextLine();
        String b2 = scan.nextLine();
        String b3 = scan.nextLine();
        String b4 = scan.nextLine();

        ArrayList<String> women = new ArrayList<>(5);
        women.add(b0);
        women.add(b1);
        women.add(b2);
        women.add(b3);
        women.add(b4);
        System.out.println("Отлично, Вот что вышло:" + women);

        System.out.println("-----------");

        System.out.println("Хорошо, ожидайте... Составляем список :)");

        ArrayList<String> couple = new ArrayList<>(10);
        couple.add(a0);
        couple.add(b4);
        couple.add(a1);
        couple.add(b3);
        couple.add(a2);
        couple.add(b2);
        couple.add(a3);
        couple.add(b1);
        couple.add(a4);
        couple.add(b0);

        System.out.println("Пары:" + couple);

        for (int i = 0; i < couple.size() - 1; i++) {
            for (int j = i + 1; j < couple.size(); j++) {
                if (couple.get(i).length() > couple.get(j).length()) {
                    String temp = couple.get(i);
                    couple.set(i, couple.get(j));
                    couple.set(j, temp);
                }
            }
        }
        System.out.println("----------");
        System.out.println("Список по возрастанию символов в имени:");
        System.out.println(couple);
    }
}
