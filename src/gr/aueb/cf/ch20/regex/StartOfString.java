package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartOfString {

    public static void main(String[] args) {
        String s = "B31:C435:R67:";

        Pattern pattern = Pattern.compile("^[A-Z].*?:");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
