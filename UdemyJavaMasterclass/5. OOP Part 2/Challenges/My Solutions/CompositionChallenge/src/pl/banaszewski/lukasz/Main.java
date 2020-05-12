package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        Room bedroom = new Room("Bedroom", new Dimensions(12, 8, 2));

        System.out.println("####################################");
        System.out.println(bedroom.getName() + " created.");
        System.out.println();
        System.out.println("The " + bedroom.getName() + " area is " + bedroom.getDimensions().getArea());
        System.out.println("The Floor area is " + bedroom.getFloor().getDimensions().getArea());
        System.out.println("The Ceiling area is " + bedroom.getCeiling().getDimensions().getArea());
        System.out.println("The North Wall area is " + bedroom.getNorthWall().getDimensions().getArea());
        System.out.println("The South Wall area is " + bedroom.getSouthWall().getDimensions().getArea());
        System.out.println("The East Wall area is " + bedroom.getEastWall().getDimensions().getArea());
        System.out.println("The West Wall area is " + bedroom.getWestWall().getDimensions().getArea());

        Furniture bedroomFurniture = new Furniture(1, 1, 2, 1, 1);
        Openings bedroomOpenings = new Openings("Exit door", "Garden view windows");
        Decoration bedroomDecoration = new Decoration("Van Gogh", "Rose");

        bedroom.getFloor().addFurniture(bedroomFurniture);
        bedroom.getFloor().addDecoration(bedroomDecoration);
        bedroom.getSouthWall().addOpenings(bedroomOpenings);

        System.out.println();
        System.out.println(bedroom.getName() + " furniture count:");
        System.out.println("Carpets = " + bedroom.getFloor().getFurniture().getCarpet());
        System.out.println("Tables = " + bedroom.getFloor().getFurniture().getTables());
        System.out.println("Chairs = " + bedroom.getFloor().getFurniture().getChairs());
        System.out.println("Beds = " + bedroom.getFloor().getFurniture().getBeds());
        System.out.println("Wardrobes = " + bedroom.getFloor().getFurniture().getWardrobes());
        System.out.println();
        System.out.println(bedroom.getName() + " decoration is:");
        System.out.println(bedroom.getFloor().getDecoration().getPainting());
        System.out.println(bedroom.getFloor().getDecoration().getPlant());
        System.out.println();
        System.out.println(bedroom.getName() + " openings are:");
        System.out.println(bedroom.getSouthWall().getOpenings().getDoor());
        System.out.println(bedroom.getSouthWall().getOpenings().getWindows());
        System.out.println();

        System.out.println("####################################");
    }
}
