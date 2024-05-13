package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of fall-through in switch/case.
 */
public class FallThroughApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert a grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Δώστε ένα βαθμό μεταξύ 1-10");
                break;
        }
    }
}
