package homework_38.Task_1;
 /*
    Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
     */

import java.util.*;

public class Homework_38_Task_01 {

    public static List<String> getUniqueSortedWords (String input) {
        // Заменяем все НЕбуквы на пустоту
        String [] newString = input.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");

        // Создаем множество для уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(newString));


        // Сортируем слова по длине, если длины одинаковые - сортируем в естественном порядке
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort((w1, w2) -> {
            int lengthComparison = Integer.compare(w1.length(), w2.length());
            return (lengthComparison != 0) ? lengthComparison : w1.compareTo(w2);
        });

        return sortedWords;
    }
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println("Строка для теста: " + testString);
        System.out.println("Результат сортировки: " + getUniqueSortedWords(testString));
    }
}
