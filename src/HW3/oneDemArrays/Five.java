package HW3.oneDemArrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Five {
    public static void main(String[] args) {

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            firstArray[i] = random.nextInt(15);
            secondArray[i] = random.nextInt(15);
        }
        out.println("first Array: " + Arrays.toString(firstArray));
        out.println("second Array: " + Arrays.toString(secondArray));

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < 5; i++) {
            firstSum += firstArray[i];
            secondSum += secondArray[i];
        }

        double firstMidArray = firstSum / 5.0;
        double secondMidArray = secondSum / 5.0;

        String messageTemplateFirst = "middle value of first array: ";
        String messageTemplateSecond = "middle value of second array: ";

        if (firstMidArray > secondMidArray) {
            out.println(messageTemplateFirst + String.format("%.01f", firstMidArray) + " GREATER than "
                    + messageTemplateSecond + String.format("%.01f", secondMidArray));
        } else if (secondMidArray > firstMidArray) {
            out.println(messageTemplateFirst + String.format("%.01f", firstMidArray) + " LESSER than "
                    + messageTemplateSecond + String.format("%.01f", secondMidArray));
        } else {
            out.println("Both middle value arrays = " + String.format("%.01f", firstMidArray) + "are equals");
        }
    }
}
