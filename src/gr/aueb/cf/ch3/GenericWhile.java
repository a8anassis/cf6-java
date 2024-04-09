package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Generic version of while.
 */
public class GenericWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
        final int TIMES = 3;
        int i = 1;

        while (i <= TIMES) {
            count = 0;
            System.out.println("Please insert start, end and step values");
            start = in.nextInt();
            end = in.nextInt();
            step = in.nextInt();

            while (start <= end) {
                count++;
                start += step;
            }

            System.out.println("Count = " + count);
            i++;
        }
    }
}
