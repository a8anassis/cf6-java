package gr.aueb.cf.ch19;

import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = new String[] {"Coding", "Factory", "AUEB"};

        printArray(intArr);
        printArray(strArr);
    }

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item + " ");
        }
    }

    public static <T extends Number> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item + " ");
        }
    }

    public static void print(GenericNode<?> node) {
        System.out.println(node.getItem());
    }

    public static void printNode(GenericNode<? extends Number> node) {
        System.out.println(node.getItem());
    }

    public static void print2Node(GenericNode<? super Number> node) {
        System.out.println(node.getItem());
    }

    public static <T> void produceConsume(Iterable<? extends T> producer, List<? super T> list) {
        for (T t : producer) {
            list.add(t);
        }
    }

}
