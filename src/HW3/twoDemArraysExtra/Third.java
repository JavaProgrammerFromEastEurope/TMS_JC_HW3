package HW3.twoDemArraysExtra;

import java.util.Arrays;

import static java.lang.System.out;

public class Third {
    public static void main(String[] args) {

        int[][] checkMateDesk = new int[8][8];

        int pawn;
        int rook;
        int knight;
        int bishop = 3;
        int queen;
        int king = 5;
        boolean check = false;

        for (int i = 0; i < checkMateDesk[0].length; i++) {
            for (int j = 0; j < checkMateDesk[0].length; j++) {
                checkMateDesk[i][j] = 0;
            }
        }
        checkMateDesk[1][1] = bishop;
        checkMateDesk[2][2] = king;
        for (int i = 0; i < checkMateDesk[0].length; i++) {
            out.println(Arrays.toString(checkMateDesk[i]));
        }
        for (int i = 2; i < checkMateDesk[0].length; i++) {
            if (checkMateDesk[i][i] == king) {
                check = true;
                break;
            }
        }
        out.println(String.format("The bishop  can make check to the King on = %b", check));

    }
}
