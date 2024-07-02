package gr.aueb.cf.ch19.lifo;

public class GarageIsEmptyException extends Exception {
    private final static long serialVersionUID = 98761L;

    public GarageIsEmptyException(String s) {
        super(s);
    }
}
