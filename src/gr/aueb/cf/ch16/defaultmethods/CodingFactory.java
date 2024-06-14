package gr.aueb.cf.ch16.defaultmethods;

public class CodingFactory implements IWelcome {
    @Override
    public void saySomething(String message) {
        System.out.println("Hello World!");
    }

    @Override
    public void sayHelloCoding() {
        IWelcome.super.sayHelloCoding();
        System.out.println("\u2764".repeat(5)); // red heart
    }
}
