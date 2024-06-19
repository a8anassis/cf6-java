package gr.aueb.cf.ch17.opt;

import java.util.*;

public class HelloOptional {

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("Coding Factory");

        String str = "Hello!!!";
        Optional<String> optStr2 = Optional.ofNullable(str);
        Optional<String> optStr3 = Optional.empty();

        if (optStr2.isPresent()) {
            String myStr = optStr2.get();
            System.out.println(myStr);
        } else {
            System.out.println("Error, string is null");
        }

        String s = optStr2.orElse("");
        String s2 = optStr2.orElseThrow(() -> new RuntimeException(""));

        int[] arr = { 1, 2, 3, 4, 5 };

        int val = Arrays
                .stream(arr)
                .filter((el) -> el % 2 == 0)
                .findFirst()
                .orElse(-1);

        List<String> list = Arrays.asList("Hello", "CF");
        List<Integer> myInt = new LinkedList<>();
        myInt.add(0);


        String strVal = list
                .stream()
                .filter((el) -> el.startsWith("H"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Error. Nothing was found."));

        list.removeIf((v) -> v.startsWith("H"));




    }
}
