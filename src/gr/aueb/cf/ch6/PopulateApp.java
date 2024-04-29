package gr.aueb.cf.ch6;

/**
 * Populate => insert initial values into array
 */
public class PopulateApp {

    public static void main(String[] args) {

        int[] arr1 = new int[5]; // 0 default values
        arr1[0] = 10;
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);

        int[] arr2 = {1, 2, 3, 4, 5};   // arr2.length == 5, unsized initialization

        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5}; // array initializer
    }
}
