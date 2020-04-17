package pl.banaszewski.lukasz;

public class AreaCalculator {

    public static double area (double radius) { // returns the area of a circle

        if(radius < 0) {
            return -1.0;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    public static double area (double x, double y) { // returns the area of a rectangle

        if(x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
