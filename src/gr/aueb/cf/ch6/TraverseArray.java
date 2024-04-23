package gr.aueb.cf.ch6;

/**
 * Traverse an array means to visit each element
 * and print the value.
 */
public class TraverseArray {

    public static void main(String[] args) {

        int[] ages = {20, 25, 22, 40};

        // simple for with index
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        // enhanced for is safe - no index
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
