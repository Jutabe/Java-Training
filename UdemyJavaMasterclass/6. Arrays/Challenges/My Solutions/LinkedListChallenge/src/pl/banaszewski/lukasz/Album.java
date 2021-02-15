package pl.banaszewski.lukasz;

import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<Song> listOfSongs;

    public Album(String name) {
        this.name = name;
        this.listOfSongs = new LinkedList<>();
    }

    public void addSong(Song song) {
        this.listOfSongs.add(song);
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getListOfSongs() {
        return listOfSongs;
    }
}
