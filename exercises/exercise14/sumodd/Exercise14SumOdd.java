package de.renemeier.udemy.timbuchalka.exercises.exercise14.sumodd;

import java.util.Scanner;

public class Exercise14SumOdd {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform what number should be started: ");
        int start = keyboard.nextInt();
        System.out.print("Inform what number should be finished: ");
        int end = keyboard.nextInt();
        System.out.println("The sum was " + sumOdd(start, end) + " and the odd value is: " + isOdd(sumOdd(start, end)));
        keyboard.close();
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}