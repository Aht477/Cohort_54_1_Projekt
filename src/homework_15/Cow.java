package homework_15;

public class Cow {
    String weight;
    String color;
    String name;
    String age;

    public Cow(String cowWeight, String cowColor, String cowAge, String cowName) {
        weight = cowWeight;
        color = cowColor;
        age = cowAge;
        name = cowName;
    }
    public void eat() {
        System.out.println("Im eat");
    }

    public void moo() {
        System.out.println("I make mooooo");
    }

    public void sleep() {
        System.out.println("Im sleep");
    }

    public void milked() {
        System.out.println("I give a milk");
    }
    public void infoCow () {
        System.out.printf("my weight %s, my color %s, my name %s, my age %s", weight, color, name, age);
    }


}
