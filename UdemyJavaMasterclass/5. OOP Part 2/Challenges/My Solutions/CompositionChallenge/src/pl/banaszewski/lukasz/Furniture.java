package pl.banaszewski.lukasz;

public class Furniture {

    private int carpet;
    private int tables;
    private int chairs;
    private int beds;
    private int wardrobes;

    public Furniture(int carpet, int tables, int chairs, int beds, int wardrobes) {
        this.carpet = carpet;
        this.tables = tables;
        this.chairs = chairs;
        this.beds = beds;
        this.wardrobes = wardrobes;
    }

    public int getCarpet() {
        return carpet;
    }

    public int getTables() {
        return tables;
    }

    public int getChairs() {
        return chairs;
    }

    public int getBeds() {
        return beds;
    }

    public int getWardrobes() {
        return wardrobes;
    }
}
