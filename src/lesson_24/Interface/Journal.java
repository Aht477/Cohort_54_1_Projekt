package lesson_24.Interface;

public class Journal implements Printable{
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + "number" + number);

    }

    @Override
    public void defaultMethod() {
        System.out.println("Default method from Journal");

    }
}
