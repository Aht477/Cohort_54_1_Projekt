package homework_09;
/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается
в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */

import java.util.Random;
import java.util.stream.IntStream;

public class Homework_09_Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int x = 0;
        while (x < numbers.length) {
            numbers[x] = random.nextInt(101);
            x++;
        }
            String arrayToString = "[";
            x = 0;
            while (x < numbers.length) {
                arrayToString += numbers[x];

                if (x != numbers.length - 1) {
                    arrayToString += ", ";
                } else {
                    arrayToString += "]";
                }
                x++;
            }
            System.out.println("Массив целых чисел"+ " " + arrayToString);

        }

    }










