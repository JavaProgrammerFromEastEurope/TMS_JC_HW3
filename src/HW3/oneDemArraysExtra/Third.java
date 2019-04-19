package HW3.oneDemArraysExtra;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Third {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        int[] array;
        Random random = new Random();
        Scanner scanner = new Scanner(in);
        int valueC;
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input two integer values into a commandline for getting array size and greater number - C: ");
        int oddSum = 0;
        while (true) {
            out.println("Input array size: ");
            if (scanner.hasNextInt()) {
                array = new int[scanner.nextInt()];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        while (true) {
            out.println("Input greater value:");
            if (scanner.hasNextInt()) {
                valueC = scanner.nextInt();
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
            if (array[i] > valueC) {
                oddSum += array[i];
                arrayList.add(array[i]);
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("The array elements greater than %d: %s", valueC, Arrays.toString(arrayList.toArray())));
        out.println(String.format("Middle value array elements greater than %d: %.2f", valueC, (oddSum / (float) arrayList.size())));
    }
}