package de.renemeier.udemy.timbuchalka.exercises.exercise15.numberpalindrome;

import java.util.Scanner;

public class Exercise15NumberPalindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        System.out.println("So the Palindrome number is: " + isPalindrome(number));
        keyboard.close();
    }

    public static boolean isPalindrome(int number) {
        int receivedNumber = number;
        int digit = 1;
        int reverse = 0;
        int lastDigit;
        int factor = 1;
        if (number < 0) {
            factor = -1;
            number = number * factor;
        }
        while (digit >= 0) {
            lastDigit = number % 10;
            reverse += lastDigit;
            number = number / 10;
            reverse *= 10;
            digit++;
            if (number < 1) {
                reverse = factor * reverse / 10;
                break;
            }

        }
        return receivedNumber == reverse;
    }
}