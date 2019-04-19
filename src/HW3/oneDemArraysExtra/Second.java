package HW3.oneDemArraysExtra;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Second {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        int[] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value into a commandline for getting array size: ");
        int oddSum = 0;
        while (true) {
            out.println("Input array size:");
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
            if (i % 2 == 1) {
                oddSum +=array[i];
                arrayList.add(array[i]);
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("Odd index array elements: %s", Arrays.toString(arrayList.toArray())));
        out.println(String.format("Middle value of odd index array elements is: %.2f", (oddSum / (float)arrayList.size())));
    }
}