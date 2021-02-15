package pl.banaszewski.lukasz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> myCollection = new ArrayList<>();

        Album firstAlbum = new Album("Album 1");
        Song song11 = new Song("Song 1.1", 123);
        Song song12 = new Song("Song 1.2", 564);
        Song song13 = new Song("Song 1.3", 342);
        Song song14 = new Song("Song 1.4", 666);
        Song song15 = new Song("Song 1.5", 1251);
        firstAlbum.addSong(song11);
        firstAlbum.addSong(song12);
        firstAlbum.addSong(song13);
        firstAlbum.addSong(song14);
        firstAlbum.addSong(song15);

        Album secondAlbum = new Album("Album 2");
        Song song21 = new Song("Song 2.1", 1524);
        Song song22 = new Song("Song 2.2", 1345);
        Song song23 = new Song("Song 2.3", 1234);
        Song song24 = new Song("Song 2.4", 9987);
        firstAlbum.addSong(song21);
        firstAlbum.addSong(song22);
        firstAlbum.addSong(song23);
        firstAlbum.addSong(song24);

        Album thirdAlbum = new Album("Album 3");
        Song song31 = new Song("Song 3.1", 4523);
        Song song32 = new Song("Song 3.2", 5621);
        Song song33 = new Song("Song 3.3", 3624);
        firstAlbum.addSong(song31);
        firstAlbum.addSong(song32);
        firstAlbum.addSong(song33);

        // Adding albums to my collection
        myCollection.add(firstAlbum);
        myCollection.add(secondAlbum);
        //myCollection.add(thirdAlbum);

        Playlist oneAndTwos = new Playlist("One and Two's");
        oneAndTwos.addSong(song11, myCollection);
        oneAndTwos.addSong(song12, myCollection);
        oneAndTwos.addSong(song21, myCollection);
        oneAndTwos.addSong(song22, myCollection);
        oneAndTwos.addSong(song31, myCollection);
        oneAndTwos.addSong(song32, myCollection);

    }


    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println( "0 - to quit\n" +
                "1 - next song\n" +
                "2 - previous song\n" +
                "3 - reply current song" +
                "4 - list songs in the playlist\n");
    }
}

