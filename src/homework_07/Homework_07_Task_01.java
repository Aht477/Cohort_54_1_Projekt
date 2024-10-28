package homework_07;
/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

import java.util.Scanner;

public class Homework_07_Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
       System.out.println("Вы ввели число ОДИН");
        } else if (number == 2) {
            System.out.println("Вы ввели число ДВА");
        } else if (number == 3) {
            System.out.println("Вы ввели число ТРИ");
        } else
            System.out.println("Вы ввели неправильное число");

    }
}

