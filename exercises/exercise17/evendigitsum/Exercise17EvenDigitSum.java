package de.renemeier.udemy.timbuchalka.exercises.exercise17.evendigitsum;

import java.util.Scanner;

public class Exercise17EvenDigitSum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        System.out.println("The sum of the even digits number is: " + getEvenDigitSum(number));
        keyboard.close();
    }

    public static int getEvenDigitSum(int number) {
        int count = 0;
        int sum = 0;
        int remainingNumber = number;
        int numberOfDigits = 1;
        if (number < 0) {
            return -1;
        } else {
            while ((remainingNumber / 10) != 0) {
                remainingNumber /= 10;
                numberOfDigits++;
            }
            while (count >= 0 && count < numberOfDigits) {
                if ((number % 2) == 0) {
                    sum += (number % 10);
                }
                number/=10;
                count++;
            }
            return sum;
        }
    }
}
