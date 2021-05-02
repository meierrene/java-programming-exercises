package de.renemeier.udemy.timbuchalka.exercises.exercise25.largestprime;

import java.util.Scanner;

public class Exercise25LargestPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        System.out.println("The largest prime from the number " + number + " is: " + getLargestPrime(number));
        keyboard.close();
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int prime = 1;
            boolean isPrime = true;
            for (int i = 2; i <= number; i++) {
                if (i != 1) {
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        System.out.println("Number " + i + " is a prime number");
                        if (number % i == 0) {
                            prime = i;
                        }
                    }
                    isPrime=true;
                }
            }
            return prime;
        }
    }
}