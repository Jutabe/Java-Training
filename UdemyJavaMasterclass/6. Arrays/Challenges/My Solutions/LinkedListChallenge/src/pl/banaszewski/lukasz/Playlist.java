package pl.banaszewski.lukasz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private String name;
    private LinkedList<Song> listOfSongs;

    public Playlist(String name) {
        this.name = name;
        this.listOfSongs = new LinkedList<>();
    }

    public void addSong(Song song, ArrayList<Album> albumCollection) {
        ListIterator<Album> albumListIterator = albumCollection.listIterator();

        boolean songOwned = false;

        while(albumListIterator.hasNext()) {
            ListIterator<Song> songListIterator = albumListIterator.next().getListOfSongs().listIterator();

            while(songListIterator.hasNext()) {
                Song temp = songListIterator.next();
                System.out.println("temp = " + temp.getTitle());
                if(temp.equals(song)) {
                    songOwned = true;
                    break;
                }
            }
        }

        if(songOwned) {
            this.listOfSongs.add(song);
            System.out.println(song.getTitle() + " added to " + this.name + " playlist.");
        } else {
            System.out.println("You do not own " + song.getTitle() + ".");
        }

    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getListOfSongs() {
        return listOfSongs;
    }
}
