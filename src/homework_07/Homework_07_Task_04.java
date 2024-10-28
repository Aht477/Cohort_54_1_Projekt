package homework_07;

import java.util.Scanner;

/*
Task 4
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее.
Если 6 или 7 — "Выходной".
 */
public class Homework_07_Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Выходной");
        } else if (number == 7) {
            System.out.println("Выходной");
        } else
            System.out.println("Вы ввели неправильное число");
    }
}
