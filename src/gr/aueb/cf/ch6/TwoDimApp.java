package gr.aueb.cf.ch6;

public class TwoDimApp {

    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];
        arr1[0][2] = 10;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = {{1, 2},
                        {3, 4},
                        {5, 6}
        };                                  // Unsized Initialization

        System.out.println();
        for (int[] row : arr2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        int[][] arr3;
        arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};      // Array Initializer

        int[][] arr4 = new int[3][];
        arr4[0] = new int[10];
        arr4[1] = new int[3];
        arr4[2] = new int[20];

        System.out.println();
        for (int[] row : arr4) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
