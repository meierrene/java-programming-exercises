package de.renemeier.udemy.timbuchalka.exercises.exercise16.firstlastdigitsum;

import java.util.Scanner;

public class Exercise16FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        System.out.println("The sum of the first and last digit number is: " + sumFirstAndLastDigit(number));
        keyboard.close();
    }

    public static int sumFirstAndLastDigit(int number) {
        int count = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int remainingNumber = number;
        int numberOfDigits = 1;
        if (number < -1) {
            return -1;
        } else if (number < 10) {
            return number * 2;
        } else {
            while ((remainingNumber / 10) != 0) {
                remainingNumber /= 10;
                numberOfDigits++;
            }
            while (count < numberOfDigits) {
                if (count == 0) {
                    lastDigit = number % 10;
                    number = number / 10;
                    count++;
                    continue;
                }
                firstDigit = number % 10;
                number = number / 10;
                count++;
            }
            return (lastDigit + firstDigit);
        }
    }
}