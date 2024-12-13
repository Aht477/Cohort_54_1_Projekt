package homework_26.Task_01;

import lesson_26.methods.UtilsGeneric;

public class PairApp  {
    public static void main(String[] args) {

        Pair <String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
