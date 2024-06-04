package gr.aueb.cf.ch15.shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Square();

        // Polymorphism
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
