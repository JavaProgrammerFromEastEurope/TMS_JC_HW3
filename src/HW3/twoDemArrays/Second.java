package HW3.twoDemArrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Second {
    public static void main(String[] args) {

        int[][] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly! ";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int sumOddElements = 0, valueSize;

        while (true) {
            out.println("Input array size :");
            if (scanner.hasNextInt()) {
                valueSize = scanner.nextInt();
                array = new int[valueSize][valueSize];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
                if (j <= i) {
                    if(array[i][j] % 2 != 0){
                        sumOddElements += array[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 10) {
                    out.print(array[i][j] + "  ");
                } else {
                    out.print(array[i][j] + " ");
                }
            }
            out.println();
        }
        out.println(String.format("Sum of odd elements under major diagonal = %d", sumOddElements));
    }
}