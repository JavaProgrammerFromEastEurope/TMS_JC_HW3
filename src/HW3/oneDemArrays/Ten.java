package HW3.oneDemArrays;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ten {
    public static void main(String[] args) {

        int[] firstArray;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int valueN;
        List<Integer> arrayList = new ArrayList<>();
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value greater then 3 into a commandline for getting array size: ");

        while (true) {
            out.println("Input array size:");
            if (scanner.hasNextInt()) {
                valueN = scanner.nextInt();
                if (valueN > 3) {
                    firstArray = new int[valueN];
                    break;
                } else {
                    out.println(String.format(messageTemplate, valueN));
                }
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(valueN);
            if (firstArray[i] % 2 == 0) {
                arrayList.add(firstArray[i]);
            }
        }
        out.println(String.format("Default Array: %s", Arrays.toString(firstArray)));
        out.println(String.format("Array with even elements: %s", Arrays.toString(arrayList.toArray())));
    }
}