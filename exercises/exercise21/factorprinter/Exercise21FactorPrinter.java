package de.renemeier.udemy.timbuchalka.exercises.exercise21.factorprinter;

import java.util.Scanner;

public class Exercise21FactorPrinter {
    public static void main(String[] args) {
        System.out.print("Select the number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        printFactors(number);
        keyboard.close();
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int count = 1;
            //int commonDivisor = 1;
            while (count >= 1) {
                if (number % count == 0) {
                    //commonDivisor = count;
                    System.out.println(count);
                }
                count++;
                if (count > number) {
                    break;
                }
            }
        }
    }
}