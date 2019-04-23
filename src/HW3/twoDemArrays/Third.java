package HW3.twoDemArrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Third {
    public static void main(String[] args) {

        int[][] array;
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        final String messageTemplateMulti = "Multiplication above Major diagram";
        final String messageTemplate = "%s is a wrong value, please get input correctly!";
        out.println("Please, input integer value  into a commandline for getting array size: ");
        int multiplicMajorDiagram = 1, multiplicManorDiagram = 1, valueSize;

        while (true) {
            out.println(" Input array size : ");
            if (scanner.hasNextInt()) {
                valueSize = scanner.nextInt();
                array = new int[valueSize][valueSize];
                break;
            } else {
                out.println(String.format(messageTemplate, scanner.next()));
            }
        }
        scanner.close();
        int manorDiagramElem = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1 + random.nextInt(50);
                if (i == j) {
                    multiplicMajorDiagram *= array[i][i];
                }
                if (j == manorDiagramElem) {
                    multiplicManorDiagram *= array[i][j];
                    out.println(" " + array[i][j]);
                }
            }
            manorDiagramElem--;
        }

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 10) {
                    out.print(array[i][j] + "  ");
                } else {
                    out.print(array[i][j] + " ");
                }
            }
            out.println();
        }
        if (multiplicMajorDiagram > multiplicManorDiagram) {
            out.println(String.format("%s %d - lesser then below - %d",
                    messageTemplateMulti, multiplicManorDiagram, multiplicMajorDiagram));
        } else if (multiplicMajorDiagram < multiplicManorDiagram) {
            out.println(String.format("%s %d - greater then below - %d",
                    messageTemplateMulti, multiplicManorDiagram, multiplicMajorDiagram));
        } else {
            out.println(String.format("Both values are equals = %d",
                    multiplicMajorDiagram));
        }
    }
}