package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyReluctantApp {

    public static void main(String[] args) {
        String s = "login:anna;pass:1234;";

        // Greedy
        //Pattern pattern = Pattern.compile(".*;");

        // Reluctant - Non-Greedy
        Pattern pattern = Pattern.compile(".*?;");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
