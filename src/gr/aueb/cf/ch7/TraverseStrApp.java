package gr.aueb.cf.ch7;

/**
 * Demo of charAt().
 */
public class TraverseStrApp {

    public static void main(String[] args) {
        String s = "Athens Univ of Econ and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
