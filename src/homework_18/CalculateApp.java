package homework_18;

import static homework_18.Calculator.*;

public class CalculateApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        setX(120);
        setY(80);

        System.out.println("addition x + y: " + sumVar());
        System.out.println("subtraction x - y: " + subtractionVar());
        System.out.println("multiplication x * y: " + multiplicationVar());
        System.out.println("division x % y: " + divisionVar());
    }
}
