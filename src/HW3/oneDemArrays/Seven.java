package HW3.oneDemArrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Seven {
    public static void main(String[] args) {

        Random random = new Random();
        int[] firstArray = new int[12];
        int maxValue = 0, index =0;

        for (int i = 0; i < 12; i++) {
            firstArray[i] = random.nextInt(15);
            if (maxValue <= firstArray[i]) {
                maxValue = firstArray[i];
                index = i;
            }
        }
        out.println("Array: " + Arrays.toString(firstArray));
        out.println("Max value is : " + maxValue + ", last max value index is: " + index);
    }
}