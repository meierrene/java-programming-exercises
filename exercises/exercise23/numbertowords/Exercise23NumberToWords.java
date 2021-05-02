package de.renemeier.udemy.timbuchalka.exercises.exercise23.numbertowords;

import java.util.Scanner;

public class Exercise23NumberToWords {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        System.out.println("Number of digits considered: " + getDigitCount(number));
        numberToWords(number);
        System.out.println("\nThe reverted number was: " + reverse(number));
        keyboard.close();
    }

    public static void numberToWords(int number) {
        System.out.print("The number " + number + " written is: ");
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int numberToPrint = reverse(number);
            int digit = getDigitCount(number);
            int count = 0;
            while (count >= 0 && count < digit) {
                if (numberToPrint % 10 == 1) {
                    System.out.print("One ");
                } else if (numberToPrint % 10 == 2) {
                    System.out.print("Two ");
                } else if (numberToPrint % 10 == 3) {
                    System.out.print("Three ");
                } else if (numberToPrint % 10 == 4) {
                    System.out.print("Four ");
                } else if (numberToPrint % 10 == 5) {
                    System.out.print("Five ");
                } else if (numberToPrint % 10 == 6) {
                    System.out.print("Six ");
                } else if (numberToPrint % 10 == 7) {
                    System.out.print("Seven ");
                } else if (numberToPrint % 10 == 8) {
                    System.out.print("Eight ");
                } else if (numberToPrint % 10 == 9) {
                    System.out.print("Nine ");
                } else {
                    System.out.print("Zero ");
                }
                numberToPrint = numberToPrint / 10;
                count++;
            }
        }
    }

    public static int reverse(int number) {
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
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int digit = 1;
            while (digit >= 1) {
                if (number / 10 != 0) {
                    number = number / 10;
                    digit++;
                }
                if (number < 10) {
                    break;
                }
            }
            return digit;
        }
    }
}