package lesson_24.Interface;

public class PrinterApp {
    public static void main(String[] args) {

        Printable book = new Book("Filosofi of Java", "Brus Eckel");

        book.print();
        book.defaultMethod();
        Printable.staticMethod();

        System.out.println("====================================");
        Printable journal = new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaultMethod();
    }


}
