package HW3.oneDemArraysExtra;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Seven {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        int[] array;
        Random random = new Random();
        final Scanner scanner = new Scanner(in);
        int repeatedValue;
        String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input two integer values into a commandline for getting array size and repeated value : ");
        int counterOfRepeatedValue = 0;
        while (true) {
            out.println("Input  array size: ");
            if (scanner.hasNextInt()) {
                array = new int[scanner.nextInt()];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        while (true) {
            out.println("Input Repeated value:");
            if (scanner.hasNextInt()) {
                repeatedValue = scanner.nextInt();
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
            if (array[i] == repeatedValue) {
                counterOfRepeatedValue++;
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("Counter of repeated value %d: %d", repeatedValue, counterOfRepeatedValue));
    }
}