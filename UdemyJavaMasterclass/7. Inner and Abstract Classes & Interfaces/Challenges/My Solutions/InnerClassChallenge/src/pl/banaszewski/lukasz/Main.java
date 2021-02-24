package pl.banaszewski.lukasz;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.getSongList().addSong("Stormbringer", 4.6);
        album.getSongList().addSong("Love don't mean a thing", 4.22);
        album.getSongList().addSong("Holy man", 4.3);
        album.getSongList().addSong("Hold on", 5.6);
        album.getSongList().addSong("Lady double dealer", 3.21);
        album.getSongList().addSong("You can't do it right", 6.23);
        album.getSongList().addSong("High ball shooter", 4.27);
        album.getSongList().addSong("The gypsy", 4.2);
        album.getSongList().addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.getSongList().addSong("For those about to rock", 5.44);
        album.getSongList().addSong("I put the finger on you", 3.25);
        album.getSongList().addSong("Let's go", 3.45);
        album.getSongList().addSong("Inject the venom", 3.33);
        album.getSongList().addSong("Snowballed", 4.51);
        album.getSongList().addSong("Evil walks", 3.45);
        album.getSongList().addSong("C.O.D.", 5.25);
        album.getSongList().addSong("Breaking the rules", 5.32);
        album.getSongList().addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).getSongList().addToPlaylist("You can't do it right", playList);
        albums.get(0).getSongList().addToPlaylist("Holy man", playList);
        albums.get(0).getSongList().addToPlaylist("Speed king", playList); // Does not exist
        albums.get(1).getSongList().addToPlaylist(9, playList);
        albums.get(1).getSongList().addToPlaylist(8, playList);
        albums.get(1).getSongList().addToPlaylist(3, playList);
        albums.get(1).getSongList().addToPlaylist(2, playList);
        albums.get(1).getSongList().addToPlaylist(24, playList); // There is not track 24

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }

                        forward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");

    }
}

