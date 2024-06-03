package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public String convertToString() {
        return "(" + x + ")";
    }

    // Public API
    public void movePlus10() {
        x += 10;
    }

    public void movePlusOne() {
        x++;
    }

    protected void reset() {
        x = 0;
    }
}
