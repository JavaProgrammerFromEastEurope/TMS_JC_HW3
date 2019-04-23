package HW3.twoDemArraysExtra;

import static java.lang.System.*;

public class Four {
    final private static int SIZE = 8;
    final private static int[][] board = new int[SIZE][SIZE];
    private static int result_counts = 0;

    public static void main(String[] args) {
        setQueen(0);
    }

    // Функция showBoard() - отображает доску.
    private static void showBoard() {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            out.println();
        }
    }

    // Функция tryQueen() - проверяет нет ли уже установленных ферзей,
    // по вертикали, диагоналям.
    private static boolean tryQueen(int a, int b) {
        for (int i = 0; i < a; ++i) {
            if ((board[i][b]) == 1) {
                return false;
            }
        }
        for (int i = 1; i <= a && b - i >= 0; ++i) {
            if ((board[a - i][b - i]) == 1) {
                return false;
            }
        }
        for (int i = 1; i <= a && b + i < SIZE; i++) {
            if ((board[a - i][b + i]) == 1) {
                return false;
            }
        }
        return true;
    }

    // Функция setQueen() - пробует найти результаты решений.
    private static void setQueen(int a) // a - номер очередной строки в которую нужно поставить очередного ферзя.
    {
        if (a == SIZE) {
            out.println(String.format("Result # %d", ++result_counts));
            showBoard();
            return;
        }
        for (int i = 0; i < SIZE; ++i) {
            // Здесь проверяем, что если поставим в board[a][i] ферзя (единицу),
            // то он будет единственным в этой строке, столбце и диагоналях.
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                setQueen(a + 1);
                board[a][i] = 0;
            }
        }
    }
}