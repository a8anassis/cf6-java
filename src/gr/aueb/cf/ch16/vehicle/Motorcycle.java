package gr.aueb.cf.ch16.vehicle;

public class Motorcycle implements IVehicle {

    @Override
    public void start() {
        System.out.println("Motorcycle was started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle was stopped.");
    }
}
