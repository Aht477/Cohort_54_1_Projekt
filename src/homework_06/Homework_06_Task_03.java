package homework_06;

import java.util.Scanner;

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
public class Homework_06_Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-------------------------");
        // четное ли число
        boolean b1 = number % 2 == 0;
        //System.out.println(b1);
        // делится на три
        boolean b2 = number % 3 == 0;
        //System.out.println(b2);
        // Четное и кратное трем
        boolean b3 = number % 2 == 0 & number % 3 == 0;
        //System.out.println(b3);
        System.out.println("Число:" + number + " " + "четное:" + " " + b1 + ";"  + " "
                + "кратно 3:" + b2  + ";" + " " +  "четное и кратное 3:" + b3);


    }
}
