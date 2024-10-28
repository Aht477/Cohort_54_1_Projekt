package homework_09;
/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
 */

import java.util.Scanner;

public class Homework_09_Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println(x);
    }
}
