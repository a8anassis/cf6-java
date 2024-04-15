package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^b με BigInteger
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two integers");
        base = BigInteger.valueOf(in.nextInt());
        power = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }
        System.out.printf("%d^%d = %,d", base, power, result);
    }
}
