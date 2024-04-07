package gr.aueb.cf.ch2;

/**
 * Dice Demo with Math.random
 *
 * @author a8ana
 *
 */
public class DiceApp {

    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("(%d, %d)", die1, die2);
    }
}
