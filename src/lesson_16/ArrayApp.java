package lesson_16;

public class ArrayApp {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());
        //tekushee kolichestvo elementov v massive s nulom
        System.out.println("size" + magicArray.size());

        magicArray.add(100);
        magicArray.add(200);


        //poluchaem strokovoe sostojanie massiva
        String info = magicArray.toString();
        System.out.println(info);
//tekushee kolichestvo elementov v massive
        System.out.println("size" + magicArray.size());

        //
        System.out.println("==================///=================");

        magicArray.addAll(300, 400, 500, 600, 700, 800, 900, 1000, 1100, 2000);

        System.out.println(magicArray.toString());
        System.out.println("size" + magicArray.size());

        System.out.println("\n ===================== \n");
        System.out.println("magicArray.remove(11): " + magicArray.remove(11));
        System.out.println("magicArray.remove(6): " + magicArray.remove(6));
        System.out.println("size: " + magicArray.size());
        System.out.println(magicArray.toString());

    }
}
