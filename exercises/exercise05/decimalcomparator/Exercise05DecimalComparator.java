package de.renemeier.udemy.timbuchalka.exercises.exercise05.decimalcomparator;

import java.util.Scanner;

public class Exercise05DecimalComparator {
    public static void main(String[] args) {
        System.out.print("Select the 1st number: ");
        Scanner keyboard = new Scanner(System.in);
        double n1 = keyboard.nextDouble();
        System.out.print("Select the 2nd number: ");
        double n2 = keyboard.nextDouble();
        boolean Compare = areEqualByThreeDecimalPlaces(n1, n2);
        System.out.println("(" + n1 + "," + n2 + ") is " + Compare);
        keyboard.close();
    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        if (n1 > n2) {
            return !((float) (n1 - n2) >= 0.001d);
        } else if (n2 > n1) {
            return !((float) (n2 - n1) >= 0.001d);
        } else {
            return true;
        }
    }
}