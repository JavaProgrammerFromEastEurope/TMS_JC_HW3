package HW3.oneDemArrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Eight {
    public static void main(String[] args) {

        Random random = new Random();
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        float[] thirdArray = new float[10];
        int fullCount = 0;

        for (int i = 0; i < 10; i++) {
            firstArray[i] = 1 + random.nextInt(10);
            secondArray[i] = 1 + random.nextInt(10);
            thirdArray[i] = (float) firstArray[i] / (float) secondArray[i];
        }

        out.println(String.format("First Array: %s", Arrays.toString(firstArray)));
        out.println(String.format("Second Array: %s", Arrays.toString(secondArray)));

        out.print("Third Array: [ ");
        for (float v : thirdArray) {
            out.print(String.format("%.1f ", v));
            if ((v * 10) % 10 == 0) {
                fullCount++;
            }
        }
        out.println("]");
        out.println(String.format("Counter of full elements = %d of third array", fullCount));
    }
}