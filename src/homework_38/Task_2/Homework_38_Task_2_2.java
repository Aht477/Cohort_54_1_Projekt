package homework_38.Task_2;
/*
Task 2
--Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
--Некоторые слова должны повторяться в обоих множествах.
--Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее
--все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество,
содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
 которые есть в первом множестве, но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для
наглядности результатов операций.
Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */

import java.util.*;

public class Homework_38_Task_2_2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

    }
    //Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее
    //все уникальные элементы из обоих множеств (объединение множеств).

//    List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
//            System.out.println("StartValues: " + startValues);
//    // Конструктор с компаратором, определяющим порядок хранения элементов
//    SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Обратный естественному порядок сортировки
//            treeSet.addAll(startValues);
//            treeSet.add(10);
//            System.out.println(treeSet);
//
//    treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
//    treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
//            treeSet.addAll(startValues);
//            System.out.println(treeSet);

}
