package lesson_17;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat( "Catty" , 8, 5);
        System.out.println(cat.toString());
       // System.out.println(cat.name);
       // cat.age = -1000;
       // cat.weight = 1500;
       // cat.name = null;
        System.out.println(cat.toString());
        String catName = cat.getName();
        System.out.println("catName" + catName);

        System.out.println("cat.getAge: " + cat.getAge());
        cat.satName(null);
        System.out.println();
        System.out.println("=================================");

        cat.setAge(-1000);
        cat.setAge(15);

        System.out.println(cat.toString());

        System.out.println("============================");
        cat.eat();
        System.out.println(cat.getWeight());
        cat.eat();
        System.out.println(cat.getWeight());

    }

}
