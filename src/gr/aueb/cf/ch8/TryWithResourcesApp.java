package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);

        try (in) {
            System.out.println("Insert a num");
            num = in.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
