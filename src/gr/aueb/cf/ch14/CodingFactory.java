package gr.aueb.cf.ch14;

/**
 * Defines a Singleton CodingFactory.
 * Eager Instantiation.
 */
public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {

    }

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello from Coding Factory!");
    }
}
