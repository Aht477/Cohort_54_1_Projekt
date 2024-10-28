package lesson_07;

import java.util.Scanner;

public class Zadanije {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int summeRest = 100;
        System.out.println("Введите полученную оценку");
        int noten = scanner1.nextInt();
        scanner1.nextLine();

        if (noten == 5) {
            System.out.println("plus 20:" + "=" + (summeRest + 20));
        } else if ( noten == 4) {
            System.out.println("plus  10: " + "=" + (summeRest + 10));
        } else if ( noten == 3) {
            System.out.println("net oplati : " + "=" + summeRest);
        } else if ( noten == 2) {
            System.out.println("minus  10: " + "=" + (summeRest - 10));
        } else {
            System.out.println( "idiot");
        }
        System.out.println("prodolgenije programmi");

    }
}
