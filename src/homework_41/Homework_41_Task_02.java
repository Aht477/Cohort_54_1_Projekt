package homework_41;

import java.util.List;
import java.util.stream.Collectors;

public class Homework_41_Task_02 {
    /*
    Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
     */
    public static void main(String[] args) {

        listOfStrings();
    }

    private static void listOfStrings() {
        List<String> strings = List.of("Bear", "Cat", "Artist", "Elephant", "Fox", "Auto", "Horse", "Lion", "Anatoliy", "Monkey", "Penguin", "Tiger", "Zebra", "Apple");

        List<String> stringList = strings.stream()
                .filter(str -> str.startsWith("A"))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
