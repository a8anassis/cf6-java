package gr.aueb.cf.ch16.shapes2;

public class Circle extends AbstractShape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
