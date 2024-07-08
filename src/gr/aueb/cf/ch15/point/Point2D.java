package gr.aueb.cf.ch15.point;

public class Point2D extends Point {
    private int y;

    public Point2D() {

    }

    public Point2D(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + y + ")";
    }
}
