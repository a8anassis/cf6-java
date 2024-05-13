package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatch {

    public static void main(String[] args) throws IOException {
        try {
            char ch = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("IO Exception");
            throw e;
        }
    }
}
