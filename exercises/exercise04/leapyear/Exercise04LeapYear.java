package de.renemeier.udemy.timbuchalka.exercises.exercise04.leapyear;

import java.util.Scanner;

public class Exercise04LeapYear {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the year: ");
        int year = keyboard.nextInt();
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is NOT a leap year");
        }
        keyboard.close();
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
