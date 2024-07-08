package gr.aueb.cf.ch16.vehicle;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        IVehicle car2 = new Car();
        IVehicle moto1 = new Motorcycle();

        car1.start();
        car1.stop();

        car2.start();
        car2.stop();

        moto1.start();
        moto1.stop();
    }
}
