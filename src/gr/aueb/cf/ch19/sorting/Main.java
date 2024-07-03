package gr.aueb.cf.ch19.sorting;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 2.25, 100),
                new Product("Apples", 3.50, 50), new Product("Apples", 8.50, 200),
                new Product("Apples", 8.50, 20)));

//        System.out.println("Ascending Sorting");
//        Collections.sort(products); // Comparable was used
//        products.forEach(System.out::println);
//
//        System.out.println("Descending Sorting");
//        Collections.reverse(products);
//        products.forEach(System.out::println);


//        System.out.println("Natural Order");
//        // Collections.sort(products, Comparator.naturalOrder());
//        products.sort(Comparator.naturalOrder());
//        products.forEach(System.out::println);
//
//        System.out.println("Reverse Order");
//        products.sort(Comparator.reverseOrder());
//        products.forEach(System.out::println);
//

//        products.sort(Comparator.comparing(Product::getDescription));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription)
//                .thenComparingDouble(Product::getPrice)
//                .thenComparingInt(Product::getQuantity));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription)
//                .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1))
//                .thenComparing(Product::getQuantity));

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getQuantity, Comparator.reverseOrder()));
        products.forEach(System.out::println);



    }
}
