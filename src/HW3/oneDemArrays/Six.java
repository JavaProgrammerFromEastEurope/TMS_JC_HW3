package HW3.oneDemArrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Six {
    public static void main(String[] args) {
        int[] firstArray = new int[4];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            firstArray[i] = random.nextInt(10);
        }
        out.println("Array: " + Arrays.toString(firstArray));

        for (int i = 0; i < 3; i++) {
            if (firstArray[i + 1] < firstArray[i]) {
                out.println("The array have unsorted values");
                break;
            }
            if (i == 2) {
                out.println("The array have are sorted values");
            }
        }
    }
}
