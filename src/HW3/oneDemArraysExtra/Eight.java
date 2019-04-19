package HW3.oneDemArraysExtra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Eight {
    public static void main(String[] args) {

        int[] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int maxElement = 0, previousMaxElement = 0;

        while (true) {
            out.println("Input  array size: ");
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
            if(maxElement < array[i]){
                previousMaxElement = maxElement;
                maxElement = array[i];
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("Previous max element - %d, max element - %d ", previousMaxElement, maxElement));
    }
}