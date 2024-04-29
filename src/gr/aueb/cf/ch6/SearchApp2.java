package gr.aueb.cf.ch6;

public class SearchApp2 {

    public static void main(String[] args) {
        int[] grades = {7, 2, 9, 10};
        int grade = 10;
        int position;

        position = getPosition(grades, grade);
        System.out.printf("Position: %d, Grade: %d", position + 1, grades[position]);
    }

    /**
     * Searches the array to find a specific value. If the
     * value is found, the position of the array is returned.
     * Time complexity is linear O(n).
     *
     * @param arr
     * @param value
     * @return
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
