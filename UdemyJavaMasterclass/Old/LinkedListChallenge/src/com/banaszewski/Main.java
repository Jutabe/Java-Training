package com.banaszewski;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        //Case study:
        //1st menu with options to add songs to playlist.
        //2nd menu with options to quit, skip forward to the next song, skip backwards to a previous song, replay
        //the current song, list the songs in the playlist.

        Album blackSabbathParanoid = new Album("Black Sabbath", "Paranoid");
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("War Pigs", Duration.parse("PT7M57S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Paranoid", Duration.parse("PT2M48S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Planet Caravan", Duration.parse("PT4M32S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Iron Man", Duration.parse("PT5M56S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Electric Funeral", Duration.parse("PT4M53S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Hand of Doom", Duration.parse("PT7M8S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Rat Salad", Duration.parse("PT2M30S").getSeconds()));
        blackSabbathParanoid.addSongsToAlbum(Song.createSong("Fairies Wear Boots", Duration.parse("PT6M15S").getSeconds()));
        albums.add(blackSabbathParanoid);

        Album ironMaidenNumberOfTheBeast = new Album("Iron Maiden", "Number of the Beast");
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Invaders", Duration.parse("PT3M23S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Children of the Damned", Duration.parse("PT4M34S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("The Prisoner", Duration.parse("PT6M02S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("22 Acacia Avenue", Duration.parse("PT6M36S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("The Number of the Beast", Duration.parse("PT4M50S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Run to the Hills", Duration.parse("PT3M53S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Gangland", Duration.parse("PT3M48S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Total Eclipse", Duration.parse("PT4M29S").getSeconds()));
        ironMaidenNumberOfTheBeast.addSongsToAlbum(Song.createSong("Hallowed Be Thy Name", Duration.parse("PT7M11S").getSeconds()));
        albums.add(ironMaidenNumberOfTheBeast);

        Album toolLateralus = new Album("Tool", "Lateralus");
        toolLateralus.addSongsToAlbum(Song.createSong("The Grudge", Duration.parse("PT8M36S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Eon Blue Apocalypse", Duration.parse("PT1M4S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("The Patient", Duration.parse("PT7M13S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Mantra", Duration.parse("PT1M12S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Schism", Duration.parse("PT6M47S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Parabol", Duration.parse("PT3M4S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Parabola", Duration.parse("PT6M3S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Ticks & Leeches", Duration.parse("PT8M10S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Lateralus", Duration.parse("PT9M24S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Disposition", Duration.parse("PT4M46S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Reflection", Duration.parse("PT11M7S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Triad", Duration.parse("PT8M46S").getSeconds()));
        toolLateralus.addSongsToAlbum(Song.createSong("Faaip de Oiad", Duration.parse("PT2M39S").getSeconds()));
        albums.add(toolLateralus);

        boolean stayInMenu = true;
        int menuOption;
        Album chosenAlbum = new Album();

        while(stayInMenu) {
            printMainMenu(chosenAlbum);
            menuOption = scanner.nextInt();
            scanner.nextLine();

            switch (menuOption) {
                case 1:
                    printAlbums();
                    menuOption = scanner.nextInt();
                    chosenAlbum = selectAlbum(menuOption);
                    break;
                case 2:
                    if(chosenAlbum == null) {
                        System.out.println("To view album songs chose an album first!");
                        break;
                    } else {
                        printSongs(chosenAlbum);
                    }

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }
    }

    public static void printMainMenu(Album chosenAlbum) {
        String chosenAlbumName = chosenAlbum.getAuthor();
        if(chosenAlbumName == null) {
            chosenAlbumName = "No album was selected";
        } else chosenAlbumName = chosenAlbum.getAuthor().concat(" - " + chosenAlbum.getTitle());

        System.out.println("Welcome to the playlist creator.\n" +
                            "1 - View available albums\n" +
                            "2 - View available songs for \"" + chosenAlbumName + "\"\n" +
                            "3 - Show current playlist\n" +
                            "4 - Play/Replay song\n" +
                            "5 - Skip forward to the next song\n" +
                            "6 - Skip backwards to the previous song\n" +
                            "7 - Quit\n");
        System.out.println("Currently playing -> \n");
        System.out.print("Select your option(1-7): ");
    }

    public static void printAlbums() {
        System.out.println();
        System.out.printf("%-18s| %5s", "Author", "Title");
        System.out.println();
        for(int i=0; i<albums.size(); i++) {
            System.out.print(i+1 + ". ");
            System.out.printf("%-15s| %5s", albums.get(i).getAuthor(), albums.get(i).getTitle() + "\n");
        }
        System.out.println();
        System.out.print("Select your album(1-" + albums.size() + "): ");
    }

    public static void printSongs(Album chosenAlbum) {
        chosenAlbum.listSongs();
        System.out.println();

    }

    public static Album selectAlbum(int albumOption) {
        return albums.get(albumOption-1);
        //return albums.get(albumOption-1).getAuthor().concat(" - " + albums.get(albumOption-1).getTitle());
    }
}
