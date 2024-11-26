package gr.aueb.cf.ch8;

public class NullPointerApp {

    public static void main(String[] args) {
        String s = null;

        if (s.equals("Athens")) {       // can not dereference
            System.out.println("EQUALS");
        }

    }
}
