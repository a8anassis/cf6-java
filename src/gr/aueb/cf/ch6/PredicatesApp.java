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

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOften(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
