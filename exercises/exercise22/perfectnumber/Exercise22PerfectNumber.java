package de.renemeier.udemy.timbuchalka.exercises.exercise22.perfectnumber;

import java.util.Scanner;

public class Exercise22PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Select the number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(number + " is a " + isPerfectNumber(number) + " perfect number.");
        keyboard.close();
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int count = 1;
            int commonDivisor = 0;
            while (count >= 1) {
                if (number % count == 0) {
                    commonDivisor += count;
                }
                count++;
                if (count >= number) {
                    break;
                }
            }
            return commonDivisor == number;
        }
    }
}
