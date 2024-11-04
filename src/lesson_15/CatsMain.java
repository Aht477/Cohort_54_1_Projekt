package lesson_15;

public class CatsMain {
    public static void main(String[] args) {

        Cat cat = new Cat();

        //sozdaetsa objekt v pamjati
        //

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println(" imja " + catName);

        int catAge = cat.age;
        System.out.println("vosrast: " + catAge);
        System.out.println("=============================================\n");

        Cat cat1 = new Cat("Max");

        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);

        cat1.info();

        System.out.println("=========================================");
        Cat cat2 = new Cat( "Diamand", "red");
        cat2.info();

        System.out.println("============================================");
        Cat cat3 = new Cat("Peter", "black", 8);
        cat3.info();
        System.out.println("============================================");
        Cat cat4 = cat3;

        cat3.age = 11;
        cat3.info();
        cat4.info();

        cat4.name = "Mary";
        cat4.info();
        cat3.info();
        System.out.println("================new cat4 ===================");
        cat4 = new Cat("Barsik", "white", 1);
        cat4.info();
        cat3.info();

    }
}
