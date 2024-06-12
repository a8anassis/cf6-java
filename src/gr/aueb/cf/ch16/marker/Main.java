package gr.aueb.cf.ch16.marker;

import gr.aueb.cf.ch16.Cat;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        CompactDisk cd = new CompactDisk();
        Cat cat = new Cat();

        deliver(book);
        deliver(cd);
        //deliver(cat);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered.");
        } else if (item instanceof CompactDisk) {
            System.out.println("CD delivered.");
        } else {
            throw new RuntimeException("Can not get delivered.");
        }
    }
}
