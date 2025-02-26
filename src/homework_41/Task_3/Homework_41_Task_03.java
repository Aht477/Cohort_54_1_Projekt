package homework_41.Task_3;

import java.util.List;
import java.util.stream.Collectors;

public class Homework_41_Task_03 {
    /*
    Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
     */
    public static void main(String[] args) {

        streamSortedPersons();


    }


    private static void streamSortedPersons() {
        Personas personas = new Personas("Anatoliy", 25, "Berlin");
        Personas personas1 = new Personas("Alexander", 30, "Kil");
        Personas personas2 = new Personas("Sergio", 35, "Paris");
        Personas personas3 = new Personas("Miron", 40, "Stuttgart");
        Personas personas4 = new Personas("Tatiana", 18, "Leipzig");
        Personas personas5 = new Personas("Stefan", 50, "Berlin");
        List<Personas>  personList = List.of(personas, personas1, personas2, personas3, personas4, personas5);


         List<Personas> filteredList = personList.stream()
                .filter(person -> person.getAge() > 30)
               //  .peek(System.out::println)
                .filter(person -> person.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println("\n result: " + filteredList);

    }


}
