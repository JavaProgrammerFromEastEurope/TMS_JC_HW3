package HW3.oneDemArraysExtra;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class First {
    public static void main(String[] args) {

        int[] array;
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int multiple = 1;
        while (true) {
            out.println("Input array  size:");
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
            if (array[i] % 3 == 0) {
                multiple *=array[i];
                arrayList.add(array[i]);
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(array)));
        out.println(String.format("Divided on 3 array elements: %s", Arrays.toString(arrayList.toArray())));
        out.println(String.format("Multiplication array elements divided on 3: %s",multiple ));
    }
}