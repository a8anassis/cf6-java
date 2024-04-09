package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι.
 *
 * @author a8ana
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean areLightsOn = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining && (isRunning || isDark);

        System.out.println("Are lights on: " + areLightsOn);
    }
}
