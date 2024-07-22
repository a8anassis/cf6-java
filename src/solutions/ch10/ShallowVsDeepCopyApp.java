package solutions.ch10;

import java.util.Arrays;


/**
 * Array shallow vs deep copy.
 */
public class ShallowVsDeepCopyApp {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                       {6, 7, 8, 9}};


        int[][] shallowCopy = shallowCopy(arr);
        System.out.println("Initial");
        printArray(arr);
        System.out.println("Shallow Copy");
        printArray(shallowCopy);

        int[][] deepCopy = deepCopy(arr);
        System.out.println("Initial");
        printArray(arr);
        System.out.println("Deep Copy");
        printArray(deepCopy);

        System.out.println("-----------");

        arr[0][2] = 62;
        arr[1][0] = 18;

        System.out.println("After Modification: ");
        System.out.println("Shallow copy:");
        printArray(arr);
        System.out.println();
        printArray(shallowCopy);

        System.out.println("Seep copy:");
        printArray(arr);
        System.out.println();
        printArray(deepCopy);
    }
    /**
     * Returns a shallow copy of the input array.
     *
     * @param arr  the source array.
     * @return     the copied array.
     */
    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    /**
     * Returns a deep copy of the input array.
     * The restriction is that the array is two-dimensional.
     *
     * @param arr   the source array.
     * @return      the copied array.
     */
    public static int[][] deepCopy(int[][] arr) {
        int[][] copyToReturn = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            copyToReturn[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                copyToReturn[i][j] = arr[i][j];
            }
        }
        return copyToReturn;
    }

    /**
     * Prints the source array.
     * @param arr    the source array.
     */
    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }
}