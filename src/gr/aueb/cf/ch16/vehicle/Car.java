package gr.aueb.cf.ch16.vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
