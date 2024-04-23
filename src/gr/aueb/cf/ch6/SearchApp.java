package gr.aueb.cf.ch6;

/**
 * Searches for an element.
 */
public class SearchApp {

    public static void main(String[] args) {
        final int SECRET = 9;
        boolean isFound = false;
        int position = -1;
        int[] arr = {1, 2, 3, 4, 6, 7, 9};  // length == 7

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SECRET) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Found: " + SECRET);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
