package gr.aueb.cf.ch8;

import java.io.IOException;

public class MethodsAndExceptions {

    /**
     * Since {@link #main(String[])} interacts with
     * the user, there is no need to propagate the
     * exception. We just catch the exception and send
     * appropriate message to the user.
     * @param args
     */
    public static void main(String[] args) {

        char ch = ' ';

        try {
            // ch = readOneChar();
            ch = readAnotherOneChar();
        } catch (IOException e) {
            System.out.println("Error. Can not read a char.");
        }
    }

    /**
     * System.in.read() throws IOException
     * Since a checked exception is thrown, it has either
     * to use 'throws' explicitly in method header
     * or has to be caught {@link #readAnotherChar()}.
     * When this type of method may be used? When no need
     * for action (handle) when the exception occurs.
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * If we catch the exception, no need to use 'throws'
     * in method header, and the exception not propagates.
     * Is it good practice not to propagate? It depends.
     * If there is a caller then we have to propagate the exception,
     * if not, then we do not propagate the exception {@link #main(String[])}
     *
     * @return
     */
    public static char readAnotherChar() {
        try {
            return (char) System.in.read(); //
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * In this type of method we catch the exception, we take
     * action --logging with System.err.println {@link java.io.PrintStream#println()}
     * and also rethrow the exception to propagate to the caller.
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try {
            return (char) System.in.read(); //
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar(char ch) throws IllegalArgumentException, IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("char not fit");
            // we need custom exception
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }

//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//            System.err.println("IO Error. " + e.getMessage());
//            throw e;
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.err.println("IO Exception. " + e.getMessage());
//            throw e;
//        }
    }

    public static char readAgainAndAgainOneChar(char ch) throws Exception {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new Exception("char not fit"); // not good to use generic
            return inputChar;
//        } catch (Exception e) {     // Exception includes IOException, Exception is generic
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//            throw e;
//        }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO Error. " + e.getMessage());
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Generic Error. " + e.getMessage());
            throw e;
        }
    }
}
