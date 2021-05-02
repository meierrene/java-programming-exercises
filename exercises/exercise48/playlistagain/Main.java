package de.renemeier.udemy.timbuchalka.exercises.exercise48.playlistagain;

import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);

        scanner.close();
    }

    public static void play(List<Song> playList) {
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        printMenu();
        while (!quit) {
            System.out.print("Select your desired options: ");
            String choice = scanner.nextLine();
            if (playList.size() == 0) {
                System.out.println("No song in playlist");
            }
            switch (choice) {
                case "0":
                    System.out.println("Closing App...");
                    quit = true;
                    break;
                case "1":
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;
                case "2":
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the start of the playlist.");
                        goingForward = true;
                    }
                    break;

                case "3":
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying song " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("You are at the start of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying song " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("Reached the end of the playlist.");
                        }
                    }
                    break;
                case "4":
                    printList(playList);
                    break;
                case "5":
                    printMenu();
                    break;
                case "6":
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Playlist actions:\nPress:");
        System.out.println("0 - To quit application");
        System.out.println("1 - Go to next song");
        System.out.println("2 - Go to previous song");
        System.out.println("3 - Replay the song");
        System.out.println("4 - List of songs");
        System.out.println("5 - Print menu options");
        System.out.println("6 - Delete current song from playlist");
    }

    public static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("====================================");
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }
        System.out.println("====================================");
    }
}
