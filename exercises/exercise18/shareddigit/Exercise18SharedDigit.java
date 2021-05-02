package de.renemeier.udemy.timbuchalka.exercises.exercise18.shareddigit;

import java.util.Scanner;

public class Exercise18SharedDigit {
    public static void main(String[] args) {
        System.out.print("Select the 1st number: ");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        System.out.print("Select the 2nd number: ");
        int number2 = keyboard.nextInt();
        boolean Compare = hasSharedDigit(number1, number2);
        System.out.println("(" + number1 + "," + number2 + ") either shared digits is: " + Compare);
        keyboard.close();
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            int firstDigitNumber1 = number1 / 10;
            int secondDigitNumber1 = number1 % 10;
            int firstDigitNumber2 = number2 / 10;
            int secondDigitNumber2 = number2 % 10;
            return firstDigitNumber1 == firstDigitNumber2 || firstDigitNumber1 == secondDigitNumber2 ||
                    secondDigitNumber1 == firstDigitNumber2 || secondDigitNumber1 == secondDigitNumber2;
        }
    }
}