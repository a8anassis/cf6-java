package gr.aueb.cf.ch16.vehicle;

public class Car implements IVehicle {

    @Override
    public void start() {
        System.out.println("Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped.");
    }
}
