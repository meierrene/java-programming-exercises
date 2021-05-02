package de.renemeier.udemy.timbuchalka.exercises.exercise03.barkingdog;

import java.util.Scanner;

public class Exercise03BarkingDog {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hour of the day (0-23h): ");
        int hourOfDay = keyboard.nextInt();
        System.out.print("\nDoes the dog barking?(y/n) ");
        String YesOrNo = keyboard.next();
        boolean Barking;
        if (YesOrNo.equals("y")) {
            Barking = true;
            System.out.println("Need to wake up: " + shouldWakeUp(Barking, hourOfDay));

        } else if (YesOrNo.equals("n")) {
            Barking = false;
            System.out.println("Need to wake up: " + shouldWakeUp(Barking, hourOfDay));

        } else {
            System.out.println("Invalid command");
        }
        keyboard.close();
    }


    public static boolean shouldWakeUp(boolean Barking, int hourOfDay) {

        if (hourOfDay == 23 && Barking) {
            return true;
        } else return hourOfDay >= 0 && hourOfDay < 8 && Barking;
    }
}