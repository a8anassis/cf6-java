package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGrades = 0;
        int gradesCount = 0;
        int average = 0;

        System.out.println("Please insert total grades and grades count");
        totalGrades = scanner.nextInt();
        gradesCount = scanner.nextInt();

        if (gradesCount == 0) {
            System.out.println("Grades count cannot be zero");
            System.exit(1);
        }

        average = totalGrades / gradesCount;

        if (average < 0 || average > 10) {
            System.out.println("Error. The average is not valid");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
    }
}
