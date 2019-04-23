package HW3.twoDemArrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Five {
    public static void main(String[] args) {

        int[][] firstArray;
        int[][] secondArray;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly! ";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int valueSize;

        while (true) {
            out.println("Input array size :  ");
            if (scanner.hasNextInt()) {
                valueSize = scanner.nextInt();
                firstArray  = new int[valueSize][valueSize];
                secondArray = new int[valueSize][valueSize];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                    firstArray[i][j] = random.nextInt(50);
                    secondArray[j][i] = firstArray[i][j];
            }
        }

        for (int i = 0; i < firstArray[0].length; i++) {
            for (int j = 0; j < firstArray[0].length; j++) {
                if (firstArray[i][j] < 10) {
                    out.print(firstArray[i][j] + "  ");
                } else {
                    out.print(firstArray[i][j] + " ");
                }
            }
            out.println();
        }
        out.println();
        for (int i = 0; i < firstArray[0].length; i++) {
            for (int j = 0; j < firstArray[0].length; j++) {
                if (secondArray[i][j] < 10) {
                    out.print(secondArray[i][j] + "  ");
                } else {
                    out.print(secondArray[i][j] + " ");
                }
            }
            out.println();
        }
    }
}