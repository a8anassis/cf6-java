package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println("key: " + k + ", value" + v));

        Iterator<Map.Entry<String, String>> itr = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals("GR")) {
                itr.remove();
                System.out.println(entry.getKey() + ": " + entry.getValue() + " removed");
            }
        }

        countries.remove("GR");

    }
}
