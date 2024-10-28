package homework_08;
/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class Homework_08_Task_02 {
    public static void main(String[] args) {
        int x = 1;

        while (x <= 10) {
            System.out.println("Task" + x);
            x++;
        }
    }
}
