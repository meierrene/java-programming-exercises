package de.renemeier.udemy.timbuchalka.exercises.exercise24.flourpacker;

import java.util.Scanner;

public class Exercise24FlourPacker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the big amount count (pack of 5kg): ");
        int bigCount = keyboard.nextInt();
        System.out.print("Inform the small amount count (pack of 1kg): ");
        int smallCount = keyboard.nextInt();
        System.out.print("Inform the goal: ");
        int goal = keyboard.nextInt();
        System.out.println(canPack(bigCount, smallCount, goal));
        keyboard.close();
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int bigCountNeeded=goal/5;
            int totalCount = bigCount * 5 + smallCount;
            if (goal <= totalCount) {
                if (bigCount == 0) {
                    return true;
                } else if (bigCountNeeded * 5 + smallCount >= goal) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
    }
}