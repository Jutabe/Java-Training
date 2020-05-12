package pl.banaszewski.lukasz;

public class Decoration {

    private String painting;
    private String plant;

    public Decoration(String painting, String plant) {
        this.painting = painting;
        this.plant = plant;
    }

    public String getPainting() {
        return painting;
    }

    public String getPlant() {
        return plant;
    }
}
