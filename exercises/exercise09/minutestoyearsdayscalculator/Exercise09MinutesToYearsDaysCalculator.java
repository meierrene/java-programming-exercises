package de.renemeier.udemy.timbuchalka.exercises.exercise09.minutestoyearsdayscalculator;

import java.util.Scanner;

public class Exercise09MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform how many minutes to be calculated: ");
        long minutes = keyboard.nextLong();
        printYearsAndDays(minutes);
        keyboard.close();
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long years = days / 365;
            long remainingdays = days % 365;
            String stringminutes = minutes + " min";
            String stringyears = years + " y";
            String stringdays = remainingdays + " d";
            if (minutes < 10) {
                stringminutes = "0" + stringminutes;
            }
            if (years < 10) {
                stringyears = "0" + stringyears;
            }
            if (remainingdays < 10) {
                stringdays = "0" + stringdays;
            }
            System.out.println(stringminutes + " = " + stringyears + " and " + stringdays);
        }
    }
}