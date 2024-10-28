package lesson_12;

public class NaN {
        public static void main(String[] args) {
            double zeroDividedByZero = 0.0 / 0.0;
            System.out.println("0.0 / 0.0 = " + zeroDividedByZero); // Выведет NaN

            double negativeSqrt = Math.sqrt(-1.0);
            System.out.println("Math.sqrt(-1.0) = " + negativeSqrt); // Выведет NaN

            // Проверка на NaN
            if (Double.isNaN(zeroDividedByZero)) {
                System.out.println("Результат является NaN");
            }

            // Сравнение NaN с NaN
            System.out.println("NaN == NaN: " + (zeroDividedByZero == negativeSqrt)); // Выведет false
        }
    }

