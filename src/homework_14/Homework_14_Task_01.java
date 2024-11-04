package homework_14;
/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */

import java.util.Random;

public class Homework_14_Task_01 {
    public static void main(String[] args) {

        int[] array = new int[20];

    }

    public static void fillArrayWithRandom(int[] array, int bound) {
        Random rand = new Random();
        int i = 0;
        while (i < array.length) {
            array[i] = rand.nextInt(bound);
            i++;
        }
        i = 1;
        while (i <= 21) {
            // Проверяем на четность
            if (i % 2 == 0) {
                // Число четное. Надо распечатать
                System.out.print(i + ", ");
            }
            i++; // Увеличиваем счетчик = берем след.число на проверку.
        }

    }
}
