package lesson_3;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;

        // slogenia
        // resultat vichisleniya
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        // vichitanie

        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // umnogenie

        result = var1 * var2;
        System.out.println("var1 * var2 =" + result);

        // zelochislennoe delenie "/"
         result = var1 / var2;
         //20/7/=
        System.out.println("var1/var2 =" + result);

        // ostatok ot delenia "%"
        int rest = var1 % var2;
        System.out.println("var1 % var2 =" + result);

        System.out.println("4/2");
        System.out.println("5%10");

        System.out.println("");
        result = 2 + 10 / 2;
        System.out.println(result);

        result = (2 + 10) / 2;
        System.out.println(result);

        System.out.println("");
        double x = 20.0d; // d - javno ukasat chto chislo sapisano v formate double
        double y = 7.0; //

        // delenie "/"
        double resoultDouble = x / y ;
        System.out.println("resoultDouble =" + resoultDouble);

        int a = 20;
        int b = 7;
        int res = 20/7;

        System.out.println("resultat delenia" + a + " na " +b + " raven = " + res);

        System.out.printf("%f\n ", resoultDouble);
        System.out.printf("%.4f\n", resoultDouble);

        // problem double
        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1; // 0.3
        System.out.println("0.1 + 0.2 = " + z);

    }
}
