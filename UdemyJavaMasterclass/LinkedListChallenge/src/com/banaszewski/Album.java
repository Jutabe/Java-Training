package com.banaszewski;

import java.util.ArrayList;

public class Album {
    private String author;
    private String title;
    private ArrayList<Song> songs;

    public Album() {

    }

    public Album(String author, String title) {
        this.author = author;
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public void addSongsToAlbum(Song song) {
        songs.add(song);
    }

    public void listSongs() {
        System.out.println();
        System.out.printf("%-18s| %5s", "Author", "Title");
        System.out.println();
        for(int i=0; i<chosenAlbum.size(); i++) {
            System.out.print(i+1 + ". ");
            System.out.printf("%-15s| %5s", albums.get(i).getAuthor(), albums.get(i).getTitle() + "\n");
        }
        System.out.println();
        System.out.print("Select your album(1-" + albums.size() + "): ");
    }

    protected String getAuthor() {
        return author;
    }

    protected String getTitle() {
        return title;
    }

    protected ArrayList<Song> getSongs() {
        return songs;
    }
}
