package gr.aueb.cf.ch6;

/**
 * Demo of symmetric array.
 */
public class SymmetricArrayApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println("Is symmetric: " + isSymmetric(arr));
    }

    /**
     * Checks if an array is symmetric, that is,
     * it is read the same RTL (Right-to-Left) and
     * LTR (Left-to-Right).
     *
     * @param arr   the input array.
     * @return      true, if the array is symmetric,
     *              false otherwise.
     */
    public static boolean isSymmetric(int[] arr) {
        boolean symmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                symmetric = false;
                break;
            }
        }
        return symmetric;
    }
}
