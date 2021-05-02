package de.renemeier.udemy.timbuchalka.exercises.exercise43.reversearray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise43ReverseArray {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Enter how many numbers to be inserted: ");
        int number = scanner.nextInt();
        reverse(getIntegers(number));
        scanner.close();
    }

    private static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " integers values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Given array = " + Arrays.toString(array));
        return array;
    }

    private static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j]=array[i];
            j++;
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }
}
