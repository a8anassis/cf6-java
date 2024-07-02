package gr.aueb.cf.ch19.lifo;

public interface IGarage {
    void addCar(String car) throws GarageIsFullException;
    String removeCar() throws GarageIsEmptyException;
    String[] getCars();
    void printCars();
    boolean isFull();
    boolean isEmpty();
}
