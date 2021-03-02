package pl.banaszewski.lukasz;

public abstract class ListItem {
    private String value;

    public ListItem(String value) {
        this.value = value;
    }

    public abstract void next();
    public abstract void previous();
    public abstract void compareTo();

    public String getValue() {
        return value;
    }
}
