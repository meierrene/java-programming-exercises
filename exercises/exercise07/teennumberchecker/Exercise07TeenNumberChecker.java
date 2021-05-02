package de.renemeier.udemy.timbuchalka.exercises.exercise07.teennumberchecker;

import java.util.Scanner;

public class Exercise07TeenNumberChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform 3 integer numbers: ");
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int n3 = keyboard.nextInt();
        System.out.println(n1 + "has a teen: " + isTeen(n1));
        System.out.println(n2 + "has a teen: " + isTeen(n2));
        System.out.println(n3 + "has a teen: " + isTeen(n3));
        System.out.println("Comparing with those number the value is: " + hasTeen(n1, n2, n3));
        keyboard.close();
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        return n1 >= 13 && n1 <= 19 || n2 >= 13 && n2 <= 19 || n3 >= 13 && n3 <= 19;
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}