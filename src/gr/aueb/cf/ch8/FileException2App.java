package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileException2App {

    public static void main(String[] args) {
        int num = 0;

        try {
            num = getNum();
            System.out.println("Num: " + num);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (InputMismatchException e) {
            System.out.println("Error reading");
        } catch (ArithmeticException e) {
            System.out.println("Error. negative Number");
        }
    }

    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws InputMismatchException
     * @throws ArithmeticException
     */
    public static int getNum() throws FileNotFoundException, InputMismatchException, ArithmeticException {
        File fd = new File("C:/tmp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)) {
            if (!in.hasNextInt()) {
                throw new InputMismatchException();
            }
            num = in.nextInt();
            if (num < 0) {
                throw new ArithmeticException("NegativeNum");
            }
        } catch (FileNotFoundException | InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}
