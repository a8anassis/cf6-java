package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Υπολογίζει το πλήθος των γραμμάτων καθώς
 * και το πλήθος των διπλών γραμμάτων (# for end).
 */
public class CharCountAndDuplicatesApp {

    public static void main(String[] args) throws IOException {
        char inputChar = ' ';
        int count = 0;
        int duplicates = 0;
        char previousChar = '\u007f';

        do {
            inputChar = (char) System.in.read();
            if (inputChar == '#') {
                break;
            }
            count++;

            if (inputChar == previousChar) {
                duplicates++;
            }

            previousChar = inputChar;
        } while (true);

        System.out.println("Count: " + count);
        System.out.println("Duplicates: " + duplicates);
    }
}
