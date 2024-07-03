package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapsDemo {

    public static void main(String[] args) {

        Map<String, Product> products = new HashMap<>() {{
            put("HON", new Product("Oranges", 3.50, 50));
            put("MIL", new Product("Milk", 2.50, 100));
            put("ORA", new Product("Oranges", 1.50, 80));
            put("EGG", new Product("Eggs", 3.50, 50));
        }};

        Map<String, Object> criteria = new HashMap<>() {{

                put("price", 10.70);
                put("quantity", 10);
                put("description", "Oranges");

        }};

        List<Product> prods = products.values()
                .stream()
                .filter(p -> p.getPrice() >= 2.50)
                .collect(Collectors.toList());


        String oranges = products.values().stream()
                .filter(p -> p.getDescription().equals(criteria.get("description"))
                        && p.getPrice() >= (double) criteria.get("price"))
                .map(Product::toString)
                .collect(Collectors.joining(", "));
    }
}
