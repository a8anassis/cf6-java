package gr.aueb.cf.ch14;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*public static Point getInstance() {
        return new Point();
    }*/

    public static Point getZeroPoint() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101));
    }
}
