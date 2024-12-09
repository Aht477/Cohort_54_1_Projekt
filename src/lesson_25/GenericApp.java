package lesson_25;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("hello");

        String StringVal = box.getValue();

        System.out.println(StringVal.length());
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("==============================");

        //GenericBox<int> boxInt = GenericBox<>();
    }
}
