package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από τον standard input,
 * τους προσθέτει και εκτυπώνει το αποτέλεσμα.
 *
 * @author a8ana
 */
public class ScannerAddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 * num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
