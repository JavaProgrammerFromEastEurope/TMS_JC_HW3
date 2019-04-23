package HW3.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.lang.System.in;
import static java.lang.System.out;

public class twoDemExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int sumArray = 0;
        int array[][] = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            out.println(Arrays.toString(array[i]));
        }
        out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                out.print(array[i][j] + " ");
            }
            out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumArray += array[i][j];
                }
            }
        }
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            sumArray += array[i][j];
//
//        }
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == --n) {
                    sumArray += array[i][j];
                }
            }
        }
        out.println(String.format("Sum elements on general diagram = %d", sumArray));
//        int[][] twoArray = new int[5][5];
//        int maxValue = 0, maxIndex = 0;
//        int[] temp = new int[5];
//
//        for (int i = 0; i < twoArray.length; i++) {
//            for (int j = 0; j < twoArray.length; j++) {
//                twoArray[i][j] = 1 + random.nextInt(10);
//            }
//        }
//        out.println();
//        for (int i = 0; i < twoArray.length; i++) {
//            out.println(Arrays.toString(twoArray[i]));
//        }
//        temp = twoArray[0];
//        twoArray[0] = twoArray[twoArray.length-1];
//        twoArray[twoArray.length-1] = temp;
//        out.println();
//
//        for (int i = 0; i < twoArray.length; i++) {
//            out.println(Arrays.toString(twoArray[i]));
//        }

    }
}
