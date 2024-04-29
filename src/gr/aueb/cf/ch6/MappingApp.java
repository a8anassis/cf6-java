package gr.aueb.cf.ch6;

public class MappingApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mappedArray = mapDouble(arr);

        traverse(mappedArray);
    }

    /**
     * Double the value of each item of the
     * array.
     *
     * @param arr   the input array.
     * @return      a new array with elements
     *              equal to double the initial
     *              array elements.
     */
    public static int[] mapDouble(int[] arr) {
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    public static void traverse(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
