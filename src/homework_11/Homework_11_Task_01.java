package homework_11;
/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Homework_11_Task_01 {
    public static void main(String[] args) {
        int[] array = {5, 10, 23, -5, 85, 6, 9};
        int result = calkulateSumm(array);
        System.out.println("Сумма элементов массива:" + result);
    }
    public static int calkulateSumm(int[]array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println();
        }
        return sum;
    }

}
