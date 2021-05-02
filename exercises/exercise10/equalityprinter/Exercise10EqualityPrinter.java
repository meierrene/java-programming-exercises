package de.renemeier.udemy.timbuchalka.exercises.exercise10.equalityprinter;

import java.util.Scanner;

public class Exercise10EqualityPrinter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the 1st number: ");
        int n1 = keyboard.nextInt();
        System.out.print("\nInform the 2nd number: ");
        int n2 = keyboard.nextInt();
        System.out.print("\nInform the 3rd number: ");
        int n3 = keyboard.nextInt();
        printEqual(n1, n2, n3);
        keyboard.close();
    }

    public static void printEqual(int n1, int n2, int n3) {
        if ((n1 < 0) || (n2 < 0) || (n3 < 0)) {
            System.out.println("Invalid Value");
        } else if ((n1 == n3) && (n2 == n3)) {
            System.out.println("All numbers are equal");
        } else if ((n1 != n3) && (n1 != n2) && (n2 != n3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
