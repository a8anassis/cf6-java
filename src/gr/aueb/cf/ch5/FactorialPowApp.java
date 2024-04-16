package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με τη χρήση της μεθόδου facto(n)
 * n! = 1 * 2 * 3 * ... * n
 */
public class FactorialPowApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 2;
        int b = 10;

        System.out.println("Please insert n");
        n = in.nextInt();

        System.out.printf("%d! = %d", n, facto(n));
        System.out.printf("%d^%d = %d", a, b, pow(a, b));
    }

    /**
     * Iterative version of n!
     *
     * @param n     the input number n.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Power a^b.
     *
     * @param a     the base.
     * @param b     the power.
     * @return      the power of a^b.
     */
    public static int pow(int a, int b) {
        int power = 1;

        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }
}
