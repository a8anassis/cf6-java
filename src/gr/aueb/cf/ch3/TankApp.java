package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true/false από το standard in για δύο
 * δεξαμενές. Αν και οι δύο έχουν καύσιμα < 1/4 τότε
 * ανάβει κόκκινη ένδειξη. Αν η μία από τις δύο έχει < 1/4 τότε
 * ανάβει πορτοκαλί ένδειξη.
 *
 * @author a8ana
 */
public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isRed = isLTQuarterTank1 && isLTQuarterTank2;
        isOrange = isLTQuarterTank1 ^ isLTQuarterTank2;
    }
}
