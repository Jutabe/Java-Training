package pl.banaszewski.lukasz;

public class Wall {

    private Dimensions dimensions;
    private Openings openings;

    public Wall(double x, double y) {
        this.dimensions = new Dimensions(x, y);
    }

    public void addOpenings(Openings openings) {
        this.openings = openings;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Openings getOpenings() {
        return openings;
    }
}
