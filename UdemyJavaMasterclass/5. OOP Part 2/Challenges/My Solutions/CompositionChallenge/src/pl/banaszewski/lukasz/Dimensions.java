package pl.banaszewski.lukasz;

public class Dimensions {

    private double x;
    private double y;
    private double z;

    public Dimensions(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;

    }

    public Dimensions(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getArea() {
        if (x <= 0 || y <= 0) {
            return -1;
        } else if(z > 0) {
            return (2 * x * y) + (2 * x * z) + (2 * y * z);
        } else {
            return x * y;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
