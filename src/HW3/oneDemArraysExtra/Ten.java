package HW3.oneDemArraysExtra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ten {
    public static void main(String[] args) {

        int[] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int maxValue = 0, maxIndex = 0;

        while (true) {
            out.println(" Input array size:");
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
            if(maxValue < array[i]){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));

        array[maxIndex] += array[0];
        array[maxIndex] -= maxValue;
        array[0] = maxValue;

        out.println(String.format("Modified Array: %s", Arrays.toString(array)));
        out.println(String.format("max index - %d, max value - %d ", maxIndex, maxValue));
    }
}