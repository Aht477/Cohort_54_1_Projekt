package homework_05;
/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

import java.util.Scanner;

public class Homework_05_Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ввести имя пользователя:");
        String name = scanner.nextLine();
        System.out.println("------------------------");
        System.out.println("Ваше имя:");
        System.out.println(name);
        System.out.println("------------------------");
        System.out.println("Kол-во символов в имени:");
        System.out.println(name.length());
        System.out.println("------------------------");
        System.out.println("Первый символ имени:");
        char firstChar = name.charAt(0);
        System.out.println(firstChar);
        System.out.println("------------------------");
        System.out.println("Последний символ имени:");
        int length = name.length();
        char lastChar = name.charAt(length - 1);
        System.out.println(lastChar);
        System.out.println("------------------------");
        System.out.println("Kод первого символа имени.");
        System.out.println(+ (int) firstChar);
        System.out.println("------------------------");
        System.out.println("Kод последнего символа имени.");
        System.out.println( + (int) lastChar);
        System.out.println("------------------------");




    }
}
