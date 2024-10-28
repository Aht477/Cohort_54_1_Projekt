package homework_05;
/*
        Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
         */

public class Homework_05_Task_02 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        System.out.println("--------------------------");
        String concatStr = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println(concatStr);
        System.out.println(concatStr.length());

        System.out.println("--------------------------");
        String concatStr2 = String.join(" ", str1,str2,str3,str4,str5,"");
        System.out.println(concatStr2);
        System.out.println(concatStr2.length());

    }
}
