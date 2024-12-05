package lesson_24.Interface;

public class Book implements Printable {

    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        System.out.printf("Book %s (%s) \n ", title, author);

    }
}
