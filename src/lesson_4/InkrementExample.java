package lesson_4;

public class InkrementExample {
    public static void main(String[] args) {

        int var = 5;

        var = var + 10;
        System.out.println("var: " + var);

        var += 2; // var = var + 2;
        System.out.println("var: " + var);

        var -= 2;
        System.out.println("var: " + var);

        var *= 2;
        System.out.println("var: " + var);

        var /= 2;
        System.out.println("var: " + var);

        // Inkrement; dekrement
        var++; // var = var + 1; var += 1;
        System.out.println(var);

        // dekrement

        var--; // var -1; var -=1;
        System.out.println(var);

        System.out.println();
        System.out.println("===================================");
        System.out.println();
        int x = 100;
        System.out.println("x: " + x++);
        System.out.println("x: " + x);

        //
        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);


    }
}
