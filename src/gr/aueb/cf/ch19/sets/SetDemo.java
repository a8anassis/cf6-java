package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        // add, remove, contains time complexity -> O(1) due to Hash
        Set<String> bag = new HashSet<>();
        bag.add("Honey");

        if (bag.contains("Milk")) {
            System.out.println("milk is already added.");
        } else {
           if (bag.add("Milk")) System.out.println("Success insert");
        }

        //bag.add("Honey");

        if (bag.remove("Milk")) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("Error in removal.");
        }
    }
}
