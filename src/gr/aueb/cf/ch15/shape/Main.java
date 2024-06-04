package gr.aueb.cf.ch15.shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Square();

        // Polymorphism
        for (Shape shape : shapes) {
            shape.draw();
            if (shape instanceof Circle) {
                System.out.println("it is a circle");
            } else if (shape instanceof Square) {
                System.out.println("it is a square");
            } else {
                System.out.println("Unknown type");
            }
        }
    }
}
