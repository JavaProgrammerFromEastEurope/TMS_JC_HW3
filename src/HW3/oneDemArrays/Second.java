package HW3.oneDemArrays;

import static java.lang.System.out;

public class Second {
    public static void main(String[] args) {

        int[] array = new int[50];
        int number = -1;
        for (int i = 0; i < array.length; i++) {
            number += 2;
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }
        out.println();
        for (int i = array.length-1; i >=0; i--) {
            out.print(array[i] + " ");
        }
    }
}