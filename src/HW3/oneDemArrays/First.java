package HW3.oneDemArrays;

import static java.lang.System.out;

public class First {
    public static void main(String[] args) {

        int[] array = new int[10];
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number += 2;
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }
        out.println();
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }
}