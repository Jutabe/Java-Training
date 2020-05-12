package pl.banaszewski.lukasz;

public class Room {

    private String name;
    private Dimensions dimensions;
    private Floor floor;
    private Ceiling ceiling;
    private Wall northWall;
    private Wall southWall;
    private Wall eastWall;
    private Wall westWall;

    public Room(String name, Dimensions dimensions) {
        double width = dimensions.getX();
        double depth = dimensions.getY();
        double height = dimensions.getZ();
        this.name = name;
        this.dimensions = dimensions;
        this.floor = new Floor(width, depth);
        this.ceiling = new Ceiling(width, depth);
        this.northWall = new Wall(width, height);
        this.southWall = new Wall(width, height);
        this.eastWall = new Wall(depth, height);
        this.westWall = new Wall(depth, height);
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getNorthWall() {
        return northWall;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public Wall getWestWall() {
        return westWall;
    }
}