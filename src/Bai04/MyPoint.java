package Bai04;

public class MyPoint {
    public static class mypoint {
        public double x;
        public double y;

        public mypoint() {
            x = 0;
            y = 0;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double distance(mypoint p1) {
            return (Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y)));
        }

    }
}

