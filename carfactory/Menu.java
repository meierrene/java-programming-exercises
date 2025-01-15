package de.renemeier.exercises.carfactory;

import java.util.Scanner;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static Factory factory = new Factory();

    public static void mainMenu() {
        boolean quit = false;
        while (!quit) {
            printList();
            System.out.print("Please choose your desired options: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> factory.assemblingCar();

                case "2" -> factory.sellingCar();

                case "3" -> factory.printCarList();

                case "4" -> {
                    System.out.println("Closing App...\n");
                    quit = true;
                    scanner.close();
                }

                default -> System.out.println("Invalid command");
            }
        }

    }

    public static void printList() {
        System.out.println("\nChoose the available actions:");
        System.out.println("1 ) - To assemble car(s)");
        System.out.println("2 ) - To sell a car");
        System.out.println("3 ) - To print updated cars list");
        System.out.println("4 ) - To quit application");
    }
}
