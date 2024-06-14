package gr.aueb.cf.ch16.defaultmethods;

public class Main {
    public static void main(String[] args) {
        IWelcome welcomeCF = new CodingFactory();

        welcomeCF.sayHelloCoding();
        welcomeCF.saySomething("Hello all!");

    }
}
