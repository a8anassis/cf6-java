package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods.
 */
public class PredicatesApp {

    public static void main(String[] args) {

    }

    /**
     * Checks is there is at least one positive
     * in the input array.
     *
     * @param arr   the input array.
     * @return      true, if there is at least one positive,
     *              false otherwise.
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }
}
