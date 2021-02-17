package pl.banaszewski.lukasz;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

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
        secondAlbum.addSong(song21);
        secondAlbum.addSong(song22);
        secondAlbum.addSong(song23);
        secondAlbum.addSong(song24);

        Album thirdAlbum = new Album("Album 3");
        Song song31 = new Song("Song 3.1", 4523);
        Song song32 = new Song("Song 3.2", 5621);
        Song song33 = new Song("Song 3.3", 3624);
        thirdAlbum.addSong(song31);
        thirdAlbum.addSong(song32);
        thirdAlbum.addSong(song33);

        // Adding albums to my collection
        myCollection.add(firstAlbum);
        myCollection.add(secondAlbum);
        //myCollection.add(thirdAlbum);

        Playlist oneAndTwos = new Playlist("One and Two's");
        System.out.println("### Adding songs to " + oneAndTwos.getName() + " playlist. ###");
        oneAndTwos.addSong(song11, myCollection);
        oneAndTwos.addSong(song12, myCollection);
        oneAndTwos.addSong(song21, myCollection);
        oneAndTwos.addSong(song22, myCollection);
        oneAndTwos.addSong(song31, myCollection);
        oneAndTwos.addSong(song32, myCollection);
        System.out.println("### ###");

        startPlaylist(oneAndTwos);


    }


    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println( "0 - to quit\n" +
                "1 - next song\n" +
                "2 - previous song\n" +
                "3 - reply current song" +
                "4 - list songs in the playlist\n");
    }

    private static void startPlaylist(Playlist playlist) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playlist.getListOfSongs().listIterator();
        Song currentSong = listIterator.next();

        if(playlist.getListOfSongs().isEmpty()) {
            System.out.println("Playlist " + playlist.getName() + " is empty.");
            return;
        } else {
            System.out.println("Now playing " + currentSong.getTitle());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Quiting playlist " + playlist.getName());
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        currentSong = listIterator.next();
                        System.out.println("Skipping forward to the next song.");
                        System.out.println("Now playing " + currentSong.getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        currentSong = listIterator.previous();
                        System.out.println("Skipping backwards to a previous song.");
                        System.out.println("Now playing " + currentSong.getTitle());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("Replying current song.");
                    System.out.println("Now playing " + currentSong.getTitle());
                    break;
                case 4:
                    System.out.println("Listing the songs in the playlist.");
                    ListIterator<Song> listIterator2 = playlist.getListOfSongs().listIterator();

                    while(listIterator2.hasNext()) {
                        int index = listIterator2.nextIndex() + 1;
                        Song value = listIterator2.next();
                        System.out.println(index + ". " + value.getTitle() + " - " + value.getDuration());
                    }
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
                }
            }
        }
}

