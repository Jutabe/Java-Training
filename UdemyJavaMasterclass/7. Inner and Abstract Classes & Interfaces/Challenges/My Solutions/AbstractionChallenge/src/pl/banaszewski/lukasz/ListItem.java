package pl.banaszewski.lukasz;

import java.util.List;

public abstract class ListItem {
    private String listName;
    private int currentIndex = 0;
    private List<String> list;

    public ListItem(String listName, String[] stringArray) {
        this.listName = listName;
        for(String string : stringArray) {
            this.list.add(string);
        }
    }

    public abstract void next();
    public abstract void previous();
    public abstract void compareTo();

    public String getListName() {
        return listName;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public List<String> getList() {
        return list;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}
