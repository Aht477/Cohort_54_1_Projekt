package homework_41;

import java.util.List;
import java.util.stream.Collectors;

public class Homework_41_Task_01 {
    /*
    Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
     */
    public static void main(String[] args) {

        sortedList();
    }

    private static void sortedList() {
        //принимающий список чисел
        List<Integer> listOfIntegers = List.of(-10, 0, 10, 25, 55, 60, 70, 80, 90, 100, 134, 160, 180, 200, 300, 400);

        List<Integer> result = listOfIntegers.stream()
                .filter(num -> num > 10 && num < 100)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("result: " + result);
    }



}
