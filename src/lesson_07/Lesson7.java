package lesson_07;

public class Lesson7 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 + "|" + str2 + "|" + str3);

        System.out.println("str1 + str2: " + (str1+str2));
        System.out.println("str1 + str3: " + (str1+str3));
        System.out.println("str1 + str3: " + (str2+str3));

        System.out.println("===================equals================");

        System.out.println();

    }
}
