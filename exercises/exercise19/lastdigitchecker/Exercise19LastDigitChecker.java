package de.renemeier.udemy.timbuchalka.exercises.exercise19.lastdigitchecker;

import java.util.Scanner;

public class Exercise19LastDigitChecker {
    public static void main(String[] args) {
        System.out.print("Select the 1st number: ");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        System.out.print("Select the 2nd number: ");
        int number2 = keyboard.nextInt();
        System.out.print("Select the 3rd number: ");
        int number3 = keyboard.nextInt();
        boolean Compare = hasSameLastDigit(number1, number2, number3);
        System.out.println("(" + number1 + "," + number2 + "," + number3 + ") either shared digits is: " + Compare);
        keyboard.close();
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (number1 >= 10 && number1 <= 1000 && number2 >= 10 && number2 <= 1000 && number3 >= 10 && number3 <= 1000) {
            int lastDigitNumber1 = number1 % 10;
            int lastDigitNumber2 = number2 % 10;
            int lastDigitNumber3 = number3 % 10;
            return lastDigitNumber1 == lastDigitNumber2 || lastDigitNumber1 == lastDigitNumber3 || lastDigitNumber2 == lastDigitNumber3;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}