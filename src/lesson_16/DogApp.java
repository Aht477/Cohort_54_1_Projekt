package lesson_16;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bim", 5);

        dog.info();
        //Ctrl +D dublirovat stroku
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.info();

    }
}
