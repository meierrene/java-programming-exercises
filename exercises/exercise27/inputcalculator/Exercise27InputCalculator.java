package de.renemeier.udemy.timbuchalka.exercises.exercise27.inputcalculator;

import java.util.Scanner;

public class Exercise27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long average = 1L;
        double ceil;
        while (true) {
            boolean isAnInt = keyboard.hasNextInt();
            if (isAnInt) {
                int number = keyboard.nextInt();
                count++;
                sum += number;
                ceil = Math.ceil((double) sum / count);
                average = (long) ceil;
            } else {
                break;
            }
        }
        if (count == 0) {
            average = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        keyboard.close();
    }
}
