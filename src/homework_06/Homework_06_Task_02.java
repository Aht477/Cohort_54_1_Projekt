package homework_06;
/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.
 */

import java.util.Random;

public class Homework_06_Task_02 {
    public static void main(String[] args) {
        System.out.println("================var1============");
        Random random = new Random();
        int var1 = random.nextInt(51);
        System.out.println("var1 0 - 50:" + " " + var1);
        System.out.println("================var2============");
        int var2 = random.nextInt(101);
        System.out.println("var2 0 - 100:"+" " + var2);
        System.out.println("----------------==--------------");
        boolean b1 = (var1 == var2);
        System.out.println(var1 + " " +  "==" + " " + var2 + " " + "->" + " " + b1);
        System.out.println("---------------!=---------------");
        boolean b2 = (var1 != var2);
        System.out.println(var1 + " " +  "!=" + " " + var2 + " " + "->" + " " + b2);
        System.out.println("--------------->-----------------");
        boolean b3 = (var1 > var2);
        System.out.println(var1 + " " +  ">" + " " + var2 + " " + "->" + " " + b3);
        System.out.println("---------------<-----------------");
        boolean b4 = (var1 < var2);
        System.out.println(var2 + " " +  "<" + " " + var1 + " " + "->" + " " + b4);

    }

}
