package de.renemeier.udemy.timbuchalka.exercises.exercise42.minimumelement;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise42MinimumElement {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The minimum number was: " + findMin(readElements(readInteger())));
        System.out.println(Arrays.toString(readElements(readInteger())));
        scanner.close();
    }

    private static int readInteger() {
        System.out.print("Enter how many numbers to be inserted: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " integers values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
