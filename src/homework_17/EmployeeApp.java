package homework_17;

public class EmployeeApp {
    public static void main(String[] args) {

       // Employee employee = new Employee("Сотрудник 1", 25, 550);

        Employee employee1 = new Employee("Сотрудник 1", 25, 550);
        Employee employee2 = new Employee("Сотрудник 2", 27, 680);
        Employee employee3 = new Employee("Сотрудник 3", 32, 445);
        Employee employee4 = new Employee("Сотрудник 4", 41, 724);


        Employee[] persons = new Employee[5];
        persons[0] = employee1;
        persons[1] = employee2;
        persons[2] = employee3;
        persons[3] = employee4;

        employee1.info();
        employee2.info();
        employee3.info();
        employee4.info();

        System.out.println(persons[1].getName());
    }
}



