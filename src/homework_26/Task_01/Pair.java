package homework_26.Task_01;
/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
Пример использования:
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World

pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
 */

import lesson_26.methods.UtilsGeneric;

public class Pair <K, V> {
    private K First;
    private V Second;





    public Pair(K getFirst, V getSecond) {
        this.First = getFirst;
        this.Second = getSecond;
    }

    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public K getFirst() {
        return First;
    }

    public void setFirst(K getFirst) {
        this.First = getFirst;
    }

    public V getSecond() {
        return Second;
    }

    public void setSecond(V getSecond) {
        this.Second = getSecond;
    }





}
