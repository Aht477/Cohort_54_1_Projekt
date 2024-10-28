package lesson_4;

public class TapeChareExample {
    public static void main(String[] args) {
        char a = 'A';
        char a1 = 65;
        char a2 = 0x41;
        char a3 = '\u0041';


        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

        char digit0 = 48;
        System.out.println("digit0: " +digit0);

        digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        char letter = 97;
        System.out.println("letter: " + letter);

        letter++;
        System.out.println("letter: " + letter);


    }
}
