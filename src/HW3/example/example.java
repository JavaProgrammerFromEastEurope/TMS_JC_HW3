package HW3.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ex;
        if (scanner.hasNextInt()) {
            ex = scanner.nextInt();
        } else {
            ex = 10;
        }
        int sumOdd = 0, a;
        for (int i = 0; i < ex; i++) {
            a = random.nextInt(10);
            out.print(a + " ");
            if (a % 2 != 0) {
                sumOdd += a;
            }
        }

        out.println("\nSum of elements " + sumOdd);
        scanner.close();
    }
}
