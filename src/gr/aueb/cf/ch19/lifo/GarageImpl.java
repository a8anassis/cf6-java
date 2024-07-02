package gr.aueb.cf.ch19.lifo;

public class GarageImpl implements IGarage {
    // Dependency Injection
    private IStorage<String> storage;
    //private final int SIZE = 15;
    private int length = 0;

    public GarageImpl(IStorage<String> storage) {
        this.storage = storage;
    }

    @Override
    public void addCar(String car) throws GarageIsFullException {
        try {
            if (isFull()) throw new GarageIsFullException("IsFull");
            storage.push(car);
            length++;
            // logging
        } catch (GarageIsFullException e) {
            // logging
            throw e;
        }
    }


    @Override
    public String removeCar() throws GarageIsEmptyException {
        try {
            if (isEmpty()) throw new GarageIsEmptyException("IsEmpty");
            // logging
            length--;
            return storage.pop();
        } catch (GarageIsEmptyException e) {
            // logging
            throw e;
        }
    }

    @Override
    public String[] toArray(String[] a) {
        return storage.toArray(a);
    }

    @Override
    public void printCars() {
        storage.printItems();
    }

    @Override
    public boolean isFull() {
        return length == storage.getSize();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

}
