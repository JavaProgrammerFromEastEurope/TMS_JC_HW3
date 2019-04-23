package HW3.TicTacToe;

import java.util.Scanner;

import static java.lang.System.*;

public class ticTacToe {

    private static Scanner scanner = new Scanner(in);
    final private static String messageTemplate = "It's wrong value, please get input correctly!";
    final private static Object[][] board = new Object[3][3];
    private static int user = 1;
    private static int state = 0;
    private static boolean over = false;

    public static void main(String[] args) {
        printArray();

        while (true) {
            state++;
            int x;
            int y;
            do {
                out.print(String.format("Input X (1..%d): ", board.length));
                x = initialize();
                out.print(String.format("Input Y (1..%d): ", board.length));
                y = initialize();
                if (board[x][y] != null) {
                    out.println(String.format(" %s", messageTemplate));
                }
            }
            while (board[x][y] != null);

            if (user == 1) {
                board[x][y] = 'X';
                user++;
            } else {
                board[x][y] = 'O';
                user--;
            }
            printArray();
            if (state >= 5) {
                showMustGoOn();
            }
            if (over) {
                out.println(String.format("The user %s win the game!", user));
                scanner.close();
                break;
            }
            if (state == 9) {
                out.println("Nobody doesn't win the game!");
                scanner.close();
                break;
            }
        }
    }

    private static void showMustGoOn() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != null) {
                for (int j = 1; j <= board.length + 1; j++) {
                    over = check(j, i);
                    if (over) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean check(int check, int index) {
        switch (check) {
            case 1:
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[i][index] != board[i + 1][index]) {
                        return false;
                    }
                    if (i == 1) {
                        return true;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[index][i] != board[index][i + 1]) {
                        return false;
                    }
                    if (i == 1) {
                        return true;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < board.length; i++) {
                    if (board[i][i] != board[i + 1][i + 1]) {
                        return false;
                    }
                    if (i == 1) {
                        return true;
                    }
                }
                break;
            case 4:
                for (int i = 0, j = board.length - 1; i < board.length; i++, j--) {
                    if (board[i][j] != board[i + 1][j - 1]) {
                        return false;
                    }
                    if (i == 1) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    private static int initialize() {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp < 4 && temp > 0) {
                    return temp - 1;
                } else {
                    out.println(messageTemplate);
                }
            } else {
                out.println(String.format("%s %s", scanner.next(), messageTemplate));
            }
        }
    }

    private static void printArray() {
        out.print("\n+---+---+---+\n");
        for (Object[] objects : board) {
            for (int j = 0; j < board.length; j++) {
                if (objects[j] == null) {
                    out.print("|   ");
                } else {
                    out.print("| " + objects[j] + " ");
                }
            }
            out.print("|\n+---+---+---+\n");
        }
        out.println(" User: " + user);
    }
}