package de.renemeier.udemy.timbuchalka.exercises.exercise01.speedconverter;

import java.util.Scanner;

public class Exercise01SpeedConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the number[km/h] to be converted: ");
        int number = keyboard.nextInt();
        printConversion(number);
        keyboard.close();
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long MilesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");
        }
    }
}