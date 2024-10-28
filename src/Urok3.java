import java.util.Random;

public class Urok3 {
    public static void main(String[] args) {

        // Четное число - это число, которое делится на 2 без остатка. Остаток от деления числа на 2 равен 0.

        // Генерация случайного числа (псевдослучайного числа)
        Random random = new Random();
        int rand = random.nextInt(101); // (0...101-1) -> (0..100) включительно
        System.out.println("Случайное число: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);


}
}

