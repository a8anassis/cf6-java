package gr.aueb.cf.ch16.shapes2;

public class Rectangle extends AbstractShape {
    private final double width;
    private final double height;

    private Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
