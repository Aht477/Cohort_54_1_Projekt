package homework_17;
/*
Task 0
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
Task 1
Инкапсулировать класс нашего магического массива
 */

public class Employee {
    private String name;
     private int age;
    private int salary;

    public Employee(String name, int age,  int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    void info() {
        System.out.println("Имя сотрудника: " + name + "; возраст: " + age + "; зарплата: " + salary);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
