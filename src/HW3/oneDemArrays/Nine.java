package HW3.oneDemArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.System.in;
import static java.lang.System.out;

public class Nine {
    public static void main(String[] args) {

        int[] firstArray;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int firstPartSum = 0, secondPartSum = 0;

        out.println("Please, input integer value into a commandline for getting array size: ");
        while (true) {
            out.println("Input array size:");
            if (scanner.hasNextInt()) {
                firstArray = new int[scanner.nextInt()];
                break;
            } else {
                out.println(String.format("%s is a wrong value, please get input correctly!", scanner.next()));
            }
        }
        scanner.close();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(15);
            if (i < ceil(firstArray.length / 2.0)) {
                firstPartSum += firstArray[i];
            } else {
                secondPartSum += firstArray[i];
            }
        }
        out.println(String.format("Array: %s", Arrays.toString(firstArray)));

        final String messageTemplateLeft = "The left side of array:";
        final String messageTemplateRight = "then right:";

        if (firstPartSum > secondPartSum) {
            out.println(String.format("%s %d, greater %s %d ",
                    messageTemplateLeft, firstPartSum, messageTemplateRight, secondPartSum));
        } else if (secondPartSum > firstPartSum) {
            out.println(String.format("%s %d, lesser %s %d ",
                    messageTemplateLeft, firstPartSum, messageTemplateRight, secondPartSum));
        } else {
            out.println(String.format("Both sum of array modules are equals %d", firstPartSum));
        }
    }
}
