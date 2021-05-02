package de.renemeier.udemy.timbuchalka.exercises.exercise47.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player = new Player("Knight", 80, 80);
        saveObject(player);
        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("M4A1");
        saveObject(player);
        System.out.println(player);
        ISaveAble werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength: " + ((Monster) werewolf).getStrength());
        // System.out.println("Strength: "+ werewolf.getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
        //loadObject(player);
        scanner.close();

    }

    public static void saveObject(ISaveAble objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i));

        }
    }

    public static void loadObject(ISaveAble objectToLoad) {
        for (int i = 0; i < objectToLoad.write().size(); i++) {
            List<String> values = readValues();
            objectToLoad.read(values);
        }
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "0":
                    quit = true;
                    break;
                case "1":
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        return values;
    }
}