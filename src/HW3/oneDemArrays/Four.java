package HW3.oneDemArrays;

import java.util.Random;
import static java.lang.System.out;

public class Four {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            out.print(array[i] + " ");
        }
        out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            out.print(array[i] + " ");
        }
    }
}