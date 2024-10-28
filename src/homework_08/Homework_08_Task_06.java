package homework_08;
/*
Массивы
Task 6
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

import java.util.Random;

public class Homework_08_Task_06 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] ints;
        ints = new int[10];

        int x = 0;
        System.out.println("[");
        while (x < ints.length){
            ints = new int[]{random.nextInt(101) - 50};
            System.out.println(new int[x]);
            x ++;
        }
        System.out.println("]");
    }
}
