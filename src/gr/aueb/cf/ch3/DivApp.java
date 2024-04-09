package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μία απλή διαίρεση. Διαίρεση με 0
 * απαγορεύεται στους ακεραίους της Java.
 * Δίνει ArithmeticException.
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

//        if (denominator != 0) {
//            if (numerator != 0) {
//                result = numerator / denominator;
//            } else {
//                System.out.println("Numerator can no be zero");
//            }
//        } else {
//            System.out.println("Denominator can not be zero");
//        }

        // Error conditions
        if (denominator == 0) {
            System.out.println("Error. Denominator is zero");
            System.exit(1);
        }

        if (numerator == 0) {
            System.out.println("Error. Numerator is zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("Result: " + result);



//        if (denominator == 0) {
//            System.out.println("Error. Denominator can not be zero");
//            System.exit(1);
//        }

        //result = numerator / denominator;

    }
}
