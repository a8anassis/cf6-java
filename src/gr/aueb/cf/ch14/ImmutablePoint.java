package gr.aueb.cf.ch14;

public class ImmutablePoint {
    private final int x;
    private final int y;

    private ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ")";
    }
}
