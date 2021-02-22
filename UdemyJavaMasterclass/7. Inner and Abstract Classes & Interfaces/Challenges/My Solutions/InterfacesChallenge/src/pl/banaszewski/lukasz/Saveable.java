package pl.banaszewski.lukasz;

import java.util.ArrayList;

public interface Saveable {
    void save();
    ArrayList<String> progress(ArrayList<String> values);
    void showLastSave();

}
