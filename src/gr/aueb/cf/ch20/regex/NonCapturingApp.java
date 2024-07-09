package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturingApp {

    public static void main(String[] args) {
        String s = "CodingFactory CodingFactoryFactory";

        Pattern pattern = Pattern.compile("(Coding)(?:Factory)+");
        Matcher matcher = pattern.matcher(s);;

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}
