package gr.aueb.cf.ch7;

/**
 * Demo of concat.
 */
public class StrConcatApp {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);

        System.out.println("s4: " + s4);
        System.out.println("s6: " + s6);
    }
}
