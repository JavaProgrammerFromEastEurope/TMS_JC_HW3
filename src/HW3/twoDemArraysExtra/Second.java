package HW3.twoDemArraysExtra;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Second {
    public static void main(String[] args) {

        Random random = new Random();

        int row = 2 + random.nextInt(5);
        int column = 2 + random.nextInt(5);

        int[][] arrayA = new int[row][column];
        int[] arrayB = new int[column];
        int[] arrayC = new int[row];

        for (int m = 0; m < row; m++) {
            for (int n = 0; n < column; n++) {
                arrayA[m][n] = 1 + random.nextInt(5);
            }
        }
        for (int n = 0; n < column; n++) {
            arrayB[n] = 1 + random.nextInt(5);
        }
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < column; n++) {
                arrayC[m] += arrayA[m][n] * arrayB[n];
            }
        }
        for (int x = 0; x < row; x++) {
            out.println(Arrays.toString(arrayA[x]));
        }

        out.println('\n' + Arrays.toString(arrayB));
        out.println('\n' + Arrays.toString(arrayC));
    }
}