package homework_38.Task_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework_38_Task_2_1 {
    public class SetUtils {
        public static void main(String[] args) {
            Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
            Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

            System.out.println(union(set1, set2));
            System.out.println(intersection(set1, set2));
            System.out.println(difference(set1, set2));
        }

        // Метод для объединения множеств
        public static Set<String> union(Set<String> set1, Set<String> set2) {
            Set<String> result = new HashSet<>(set1);
            result.addAll(set2);
            return result;
        }

        // Метод для пересечения множеств
        public static Set<String> intersection(Set<String> set1, Set<String> set2) {
            Set<String> result = new HashSet<>(set1);
            result.retainAll(set2);
            return result;
        }

        // Метод для разности множеств
        public static Set<String> difference(Set<String> set1, Set<String> set2) {
            Set<String> result = new HashSet<>(set1);
            result.removeAll(set2);
            return result;
        }

    }
//    Пояснение
//    Создание множеств:

//    java
    Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
    Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
//    Здесь мы создаем два множества с начальными значениями.

//    Метод union():

//    java
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
//    Метод union объединяет два множества, добавляя все элементы из второго множества в первое.

//    Метод intersection():

//    java
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
//    Метод intersection создает пересечение двух множеств, сохраняя только общие элементы.

//            Метод difference():

//    java
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
//    Метод difference возвращает элементы, которые присутствуют в первом множестве, но отсутствуют во втором.

//            Результаты
//    При выполнении программы результат будет следующим:

//    java
//[A, B, C, D, E, F]
//            [C, D]
//            [A, B]
//    union(set1, set2) возвращает объединение множеств: [A, B, C, D, E, F].
//
//    intersection(set1, set2) возвращает пересечение множеств: [C, D].
//
//    difference(set1, set2) возвращает разность множеств: [A, B].

//    Этот пример демонстрирует, как можно выполнять операции объединения, пересечения и разности множеств на языке Java. Если у вас есть дополнительные вопросы или нужно больше объяснений, не стесняйтесь спрашивать!
}
