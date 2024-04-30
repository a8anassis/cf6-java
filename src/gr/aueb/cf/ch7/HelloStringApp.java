package gr.aueb.cf.ch7;

public class HelloStringApp {

    public static void main(String[] args) {

        String s = "Alice";                // length == 5, δηλαδή 0 - 4
        String bob = new String("Bob");

        System.out.println("Length of \"Alice\": " + s.length());
        System.out.println("Length of \"Bob\": " + bob.length());
    }
}
