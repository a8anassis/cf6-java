package solutions.ch8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Runtime Exceptions handling. Although Runtime
 * exceptions shouldn't be handled since they are
 * considered programming errors, there are cases
 * where that kind of exception are recoverable.
 */
public class ExceptionsApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "";

        while (true) {
            printMenu();
            s = getChoice();
            if (s.matches("[qQ]")) break;
            try {
                printChoice(s);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice: " + s);
            }
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("Q or q. Exit");
    }

    public static String getChoice()  {
        return in.nextLine().trim();
    }

    public static void printChoice(String s) throws IllegalArgumentException {
        int choice = 0;

        try {
            choice = Integer.parseInt(s);
            if (!isValid(choice)) {
                throw new IllegalArgumentException();
            }
            System.out.println("Choice: " + s);
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static boolean isValid(int choice) {
        return (choice >= 1) && (choice <= 4);
    }

    public static void log(Exception e) {
        Path path = Paths.get("C:/tmp/log.txt");

        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
