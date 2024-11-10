package lesson_17;

public class PersonsApp {
    public static void main(String[] args) {


        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, musik");
        System.out.println(john.toString());

        Person[] people = new  Person[5]; //sozdaetsa massiv dla 5 ssilok na objekti Person
        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("================================================\n");
        System.out.println(people[0].toString());
        System.out.println("peple[0].getName:" + people[0]);
        System.out.println("garry: " + garry.toString());

    }
}
