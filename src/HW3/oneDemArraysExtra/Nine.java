package HW3.oneDemArraysExtra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
public class Nine {
    public static void main(String[] args) {

        int[] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size:  ");
        int lessElement = 10;
        while (true) {
            out.println("Input  array  size: ");
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
            if (i % 2 == 0) {
                if (lessElement > array[i]){
                    lessElement = array[i];
                }
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("less even index element of array : %s",lessElement ));
    }
}