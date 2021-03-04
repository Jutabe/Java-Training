package pl.banaszewski.lukasz;

public abstract class ListItem {
    protected ListItem nextReference = null;
    protected ListItem previousReference = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract void next();
    public abstract void setNextReference();
    public abstract void previous();
    public abstract void setPreviousReference();
    public abstract int compareTo(ListItem item);

    public ListItem getNextReference() {
        return nextReference;
    }

    public ListItem getPreviousReference() {
        return previousReference;
    }

    public Object getValue() {
        return value;
    }
}
