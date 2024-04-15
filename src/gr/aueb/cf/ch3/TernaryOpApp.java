package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το min με τριαδικό τελεστή.
 * Ο χρήστης εισάγει δύο ακεραίους.
 */
public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2) min = num1;

        min = (num1 < num2) ? num1 : num2;

        System.out.printf("The min of (%d, %d) is %d", num1, num2, min);
        System.out.printf("The min of (%d, %d) is %d", num1, num2, (num1 < num2) ? num1 : num2);
        System.out.printf("The min of (%d, %d) is %d", num1, num2, Math.min(num1, num2));
    }
}
