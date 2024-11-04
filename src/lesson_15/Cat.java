package lesson_15;

public class Cat {
    //polja klassa
    String name;
    String color;
    int age;

    // peregruzka konstruktora klassa
    public Cat(String catName){
        name = catName;

    }
    public Cat(String catName, String color) {
        name = catName;
        //kluchevoe slovo - this - ispolsuetsa vnutri klassa dla ssylki na tekuschij objekt
       this.color = color;
    }
    public Cat(String name, String color, int age) {
        this(name, color); //visiv drugogo konstruktora, budet pervoi strokoi koda
        //visivaetsa konstruktor klassa prinimauschij dve stringi
        //
      //  this.name = name;
        //this.color = color;
        this.age = age;
    }

    //pustoj konstruktor idet po umolchaniju
    public Cat(){



    }

    public void sleep() {
        System.out.println("Im sleepping");
    }
    public void run() {
        System.out.println("ja begu");

    }
    public void sayMeow () {
        System.out.println("meow");


    }
    public void info() {
        System.out.printf("ja kotik %s, moj vosrast %d, moj okras: %s\n", name, age, color);
    }
}
