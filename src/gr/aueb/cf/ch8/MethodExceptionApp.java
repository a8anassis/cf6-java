package gr.aueb.cf.ch8;

import java.io.IOException;

public class MethodExceptionApp {

    public static void main(String[] args) {
        char ch = ' ';

        try {
            ch = readOneChar();
        } catch (IOException e) {
            System.out.println("Error. Can not read a char.");
        }
    }

    /**
     * Returns one char.
     *
     * @return
     *          one char.
     * @throws IOException
     *          if I/O error.
     */
    public static char readOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
