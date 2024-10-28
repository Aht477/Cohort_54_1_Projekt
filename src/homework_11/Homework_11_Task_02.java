package homework_11;
/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

public class Homework_11_Task_02 {
    public static void main(String[] args) {
     double[] array = {7, 52, 4, -8, 12, 452, -100, 70} ;
     double result = averageValueMethodInArray(array);
        System.out.println("Среднее значение элементов в массиве: " + result);

    }
    public static double averageValueMethodInArray (double[]array){
        double val = 0;
        for (int i = 0; i < array.length; i++) {
            val += array[i];
        }

        return val/array.length;
    }

}
