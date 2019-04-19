package HW3.oneDemArraysExtra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Six {
    public static void main(String[] args) {

        int[] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size: ");

        while (true) {
            out.println(" Input array size: ");
            if (scanner.hasNextInt()) {
                array = new int[scanner.nextInt()];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]) {
                out.println("The values of array are different");
                break;
            } else {
                out.println("The values of array are equals");
                break;
            }
        }
    }
}