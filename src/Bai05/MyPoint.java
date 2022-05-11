package Bai05;

public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint secondPoint) {
        double temp = Math.pow(secondPoint.getX() - this.x, 2) + Math.pow(secondPoint.getY() - this.y, 2);
        return Math.sqrt(temp);
    }
}
