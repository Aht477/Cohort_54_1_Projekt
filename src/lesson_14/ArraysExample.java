package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 0};

        //strokovoe sostojanoe masiva
        String arrayToString = Arrays.toString(array);
        System.out.println(Arrays.toString(array));

        //sortiruet massiv
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //binarnij poisk - bistrij poisk (massiv dolgen bit otsortirovan)
        // vosvraschajet indeks elemna, esli ne najden to vosvraschaet otrizatrlnoe znachenie

        int index = Arrays.binarySearch(array, 3);
        System.out.println("index" + index);

        //metod proveraet ravni li dva massiva
        int[] test = {0, 1, 3, 3};
        boolean iaArraysEquals = Arrays.equals(array,test);
        System.out.println("iaArraysEquals: " + iaArraysEquals);

        //metod nahodit i vosvraschaet indeks pervogo raslichija megdu massivami

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("mismatch: " + mismatchIndex);


        //mnogomernij massiv
        int[][] arrayD = new int[6][5];
        //metod vosvraschaet strokovoe predstavlenie mnogomernich massivov vkluchaja vlogennie massivi
        System.out.println(Arrays.deepToString(arrayD));

        //sravnenie po snacheniju mnogomernih massivov
        int[][] arrayC = new int[6][5];
        System.out.println(Arrays.deepEquals(arrayC, arrayD));

        arrayC[2][3]=1;
        System.out.println(Arrays.deepToString(arrayC));

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");

        }
        System.out.println();

        //perebrat vse znachenija dvumernogo massiva
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                System.out.println(arrayC[i][j] + ",");

            }
            System.out.println();

        }
        System.out.println("===============================================");

        //copyOf - metod kopiruet massiv ili ego chast v novij massiv
        int[] copiOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copiOfTest));

        int[] copyOfTest2 = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(test));

        //sapolnenije massiva
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        //chast massiva ismenit
        Arrays.fill(arr, 1,4, 1000);
        System.out.println(Arrays.toString(arr));

        System.out.println("=================================================");
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(1001));
        System.out.println(Arrays.toString(arr));
    }
}
