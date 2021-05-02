package de.renemeier.udemy.timbuchalka.exercises.exercise20.greatestcommondivisor;

import java.util.Scanner;

public class Exercise20GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.print("Select the 1st number: ");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        System.out.print("Select the 2nd number: ");
        int number2 = keyboard.nextInt();
        System.out.println("The greatest common divisor between numbers "
                + number1 + " and " + number2 + " is: " + getGreatestCommonDivisor(number1, number2));
        keyboard.close();
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int count = 2;
            int commonDivisor = 1;
            while (count >= 2) {
                if (first % count == 0 && second % count == 0) {
                    commonDivisor = count;
                }
                count++;
                if (count >= first && count >= second) {
                    break;
                }
            }
            return commonDivisor;
        }
    }
}