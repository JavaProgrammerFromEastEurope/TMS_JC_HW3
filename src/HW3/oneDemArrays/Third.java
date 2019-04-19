package HW3.oneDemArrays;

import java.util.Random;

import static java.lang.System.out;

public class Third {
    public static void main(String[] args) {

        int[] array = new int[15];
        Random random = new Random();
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] % 2 == 0){
                evenCount++;
            }
            out.print(array[i] + " ");
        }
        out.println("\nCount of even elements = " + evenCount);
    }
}