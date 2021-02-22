package pl.banaszewski.lukasz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Saveable player1;
        player1 = new Player("Jutabe");
        player1.progress(readValues());
        player1.save();
        player1.showLastSave();
        player1.progress(readValues());
        player1.save();
        player1.showLastSave();

        Saveable monster1;
        monster1 = new Monster("Wookie");
        monster1.progress(readValues());
        monster1.save();
        monster1.showLastSave();
        monster1.progress(readValues());
        monster1.showLastSave();
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter an action: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
