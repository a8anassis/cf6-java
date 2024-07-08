package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date2App {

    public static void main(String[] args) {
        String engDate = "12/30/2024 07/08/2024 02/03/2025";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(engDate);

       while (matcher.find()) {
           String grDate = null;
           for (int i = 1; i <= matcher.groupCount(); i++) {
               String month = matcher.group(1);
               String day = matcher.group(2);
               String year = matcher.group(3);
               grDate = day + "/" + month + "/" + year;
           }
           System.out.println(grDate);
       }
    }
}
