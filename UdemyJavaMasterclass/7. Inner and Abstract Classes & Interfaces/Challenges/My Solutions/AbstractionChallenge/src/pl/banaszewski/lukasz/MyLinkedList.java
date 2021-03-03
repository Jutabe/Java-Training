package pl.banaszewski.lukasz;

public class MyLinkedList extends ListItem{

    public MyLinkedList(String listName, String[] list) {
        super(listName, list);
    }

    @Override
    public void next() {
        if(getList().size() < 1) {
            System.out.println(getListName() + " is empty, please add some values first.");
            return;
        }

        if(getList().size() <= getCurrentIndex()) {
            System.out.println(getListName() + " have reached the end of the list.");
            return;
        } else {
            setCurrentIndex(getCurrentIndex() + 1);
        }
    }

    @Override
    public void previous() {
        if(getList().size() < 1) {
            System.out.println(getListName() + ": This list is empty, please add some values first.");
            return;
        }

        if(getCurrentIndex() < 0) {
            System.out.println(getListName() + ": Already on the start of the list.");
            return;
        } else {
            setCurrentIndex(getCurrentIndex() - 1);
        }
    }

    @Override
    public void compareTo() {

    }
}
