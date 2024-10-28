package homework_08;
/*
Task 1
Найдите произведение всех чисел от 1 до 10 включительно.

Результат выведите на экран
 */

public class Homework_08_Task_01 {
    public static void main(String[] args) {
long mult = 1;
int a = 1;
while (a <= 10) {
    mult = mult * a;
    a ++ ;
}
        System.out.println("Произведение всех чисел от 1 до 10 включительно: " +  mult);
    }
}
