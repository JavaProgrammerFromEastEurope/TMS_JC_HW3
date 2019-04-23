package HW3.example;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.out;

public class Bubble_sort {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 4, 2};

        out.println(Arrays.toString(array));
//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(array, Collections.reverseOrder());

        out.println(Arrays.toString(array));
    }
}