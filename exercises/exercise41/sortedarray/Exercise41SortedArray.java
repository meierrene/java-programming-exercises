package de.renemeier.udemy.timbuchalka.exercises.exercise41.sortedarray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise41SortedArray {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Enter how many numbers to be inserted: ");
        int number = scanner.nextInt();
        System.out.println("Sorted array with descending mode = " + Arrays.toString(sortIntegers(getIntegers(number))));
        scanner.close();
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " integers values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Given array = " + Arrays.toString(array));
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j + 1] > sortedArray[j]) {
                    temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
