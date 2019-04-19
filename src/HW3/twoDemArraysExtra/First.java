package HW3.twoDemArraysExtra;

import java.util.Arrays;

import static java.lang.System.out;

public class First {
    public static void main(String[] args) {
        int[][] spiral = new int[20][20];
        int first = 0;
        int last = 20;
        int i = 0;
        int j = -1;
        int number = 0;
        while (last > 1) {

            for (j++; j < last; j++) {
                spiral[i][j] = ++number;
            }
            j--;
            for (i++; i < last; i++) {
                spiral[i][j] = ++number;
            }
            i--;
            for (j--; j >= first; j--) {
                spiral[i][j] = ++number;
            }
            j++;
            for (i--; i > first; i--) {
                spiral[i][j] = ++number;
            }
            i++;
            first++;
            last--;
        }

        for (int x = 0; x < spiral[0].length; x++) {
            out.println(Arrays.toString(spiral[x]));
        }
    }

}
