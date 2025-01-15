package de.renemeier.exercises.carfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factory {

    public static Scanner scanner = new Scanner(System.in);

    private final List<Car> cars;

    public Factory() {
        this.cars = new ArrayList<>();
    }

    public void sellingCar() {
        if (!cars.isEmpty()) {
            printCarList();
            System.out.print("Choose which car would you like to sell: ");
            int choice = scanner.nextInt();
            choice = choice - 1;
            if (choice >= 0 && choice < cars.size()) {
                System.out.println("The car " + cars.get(choice).getModel() + ", colour " + cars.get(choice).getColour() + " was sold with success.");
                cars.remove(choice);
            } else {
                System.out.println("\nInvalid command. Action was not processed.");
            }
        } else {
            System.out.println("\nCar is not in stock. Action was not processed.");
        }
    }

    public void assemblingCar() {
        System.out.print("How many cars do you want to assemble? ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= count; i++) {
            Car newCar = new Car();
            System.out.print("Type the model car number " + i + ": ");
            String model = scanner.nextLine();
            newCar.setModel(model);
            System.out.print("Type the colour car number " + i + ": ");
            String colour = scanner.nextLine();
            newCar.setColour(colour);
            cars.add(newCar);
            System.out.println("The car " + newCar.getModel() + " with colour " + newCar.getColour() + " was assembled with success. ");
        }
    }

    public void printCarList() {
        System.out.println("\n");
        if (cars.isEmpty()) {
            System.out.println("There is no car in the list available.");
        } else {
            System.out.println("Found " + cars.size() + " match(es).");
            for (Car car : cars) {
                System.out.println((cars.indexOf(car) + 1) + ") - " + car.getModel() + " colour: " + car.getColour());
            }
        }
    }
}
