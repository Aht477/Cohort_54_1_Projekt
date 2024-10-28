package lesson_07;

import java.util.Random;

public class MinimalnojeChislo {
    public static void main(String[] args) {
        Random random = new Random();

        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);
        System.out.println(v1 + "|" + v2 + "|" + v3);


    }
}
