package homework_22.Task_00;

public class SooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.eat();
        cat.voice();
        System.out.println(cat.toString());

        System.out.println("==============Dog==================");
        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("==============Hamster==================\n");
        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster);
    }
}
