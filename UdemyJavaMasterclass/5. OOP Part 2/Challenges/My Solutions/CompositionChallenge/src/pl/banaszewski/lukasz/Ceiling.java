package pl.banaszewski.lukasz;

public class Ceiling {

    private Dimensions dimensions;
    private int lighting;

    public Ceiling(double x, double y) {
        this.dimensions = new Dimensions(x, y);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getLighting() {
        return lighting;
    }

    public void setLighting(int lighting) {
        this.lighting = lighting;
    }
}
