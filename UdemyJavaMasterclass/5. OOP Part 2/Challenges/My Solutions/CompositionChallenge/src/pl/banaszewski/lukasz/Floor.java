package pl.banaszewski.lukasz;

public class Floor {

    private Dimensions dimensions;
    private Furniture furniture;
    private Decoration decoration;

    public Floor(double x, double y) {
        this.dimensions = new Dimensions(x, y);
    }

    public void addFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public void addDecoration(Decoration decoration) {
       this.decoration = decoration;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Decoration getDecoration() {
        return decoration;
    }
}
