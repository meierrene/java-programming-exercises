package de.renemeier.udemy.timbuchalka.exercises.exercise13.numberofdaysinmonth;

import java.util.Scanner;

public class Exercise13NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.print("Select the year: ");
        Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();
        System.out.print("Select the month: ");
        int month = keyboard.nextInt();
        System.out.println("Month " + month + " has " + getDaysInMonth(month, year) + " days and the leap year for " + year + " is " + isLeapYear(year));
        keyboard.close();
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
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

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }
        }
    }
}
