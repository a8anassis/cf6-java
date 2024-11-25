package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingArithmException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int.Please insert numerator.");
            in.nextLine();
        }
        System.out.println("Please insert denominator");
        numerator = in.nextInt();
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int.Please insert denominator");
            in.nextLine();
        }
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error. Denominator can not be zero");
            System.exit(1);
        }
        result = numerator / denominator;

        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}
