package homework_18;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
 */


public class Calculator {

private static int  x;
private static int  y;

    public Calculator() {
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Calculator.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Calculator.y = y;
    }

    public static int sumVar() {
    int sum = x + y;
    return sum;
    }

    public static int subtractionVar () {
        int result = x - y;
        return result;
    }

    public static double multiplicationVar () {
        double result = (double) x * y;
        return result;
    }

    public static double divisionVar () {
        double result = (double) x / y;
        return result;
    }
}
