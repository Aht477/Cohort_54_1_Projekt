package homework_08;
/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
 */

public class Homework_08_Task_03 {
    public static void main(String[] args) {

        int x = 1;

        while (x <= 100) {
            if (x % 5 == 0) {
                System.out.print(x + ", ");
            }
                x++;
            }
        }
    }

