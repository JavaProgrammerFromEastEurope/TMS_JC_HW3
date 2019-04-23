package HW3.twoDemArraysExtra;

import static java.lang.System.out;

public class First {
    public static void main(String[] args) {
        int[][] spiral = new int[10][10];
        int first = 0;
        int last = 10;
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
            for (int y = 0; y < spiral[0].length; y++) {
                if(spiral[x][y] < 10){
                    out.print(spiral[x][y] + "  ");
                } else {
                    out.print(spiral[x][y] + " ");
                }
            }
            out.println();
        }
    }

}
