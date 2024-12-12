package homework_26.Task_01;

import lesson_26.methods.UtilsGeneric;

public class PairApp  {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};


        Pair <String, String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair.swap(strings, 0, 1);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
