package gr.aueb.cf.ch19.lifo;

public class Main {

    public static void main(String[] args) {
        // Wiring
        IStorage<String> storage = new StorageImpl<>(50);
        IGarage garage = new GarageImpl(storage);

        try {
            garage.addCar("IZZ9801");
            System.out.println("Successfully inserted");

            garage.addCar("RZZ7654");
            System.out.println("Successfully inserted");

            String removedCar = garage.removeCar();
            System.out.println("Removed: " + removedCar);

            garage.printCars();
        } catch (GarageIsFullException e) {
            System.out.println("Garage is full");
        } catch (GarageIsEmptyException e) {
            System.out.println("Garage is empty");
        }


    }
}
