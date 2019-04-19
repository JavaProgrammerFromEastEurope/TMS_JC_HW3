package HW3.example;

import java.util.Arrays;

import static java.lang.System.out;

public class Array {
    public static void main(String[] args) {
        int[] tempArray = {1, 2, 3, 4, 5};
        out.println(Arrays.toString(tempArray));
        int sum = 0;
        int max = tempArray[0];
        for (int i = 0; i < tempArray.length; i++) {
            sum +=tempArray[i];
            if(max < tempArray[i]){
                max = tempArray[i];
            }
        }
        out.println("Sum of elements = " + sum +  " max = " + max);

//        for (int i = tempArray.length - 1; i >= 0; i--) {
//            if (tempArray[i] % 2 == 0) {
//                out.print(tempArray[i] + " ");
//            }
//        }
    }
}
