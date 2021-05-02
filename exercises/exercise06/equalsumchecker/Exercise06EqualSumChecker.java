package de.renemeier.udemy.timbuchalka.exercises.exercise06.equalsumchecker;

import java.util.Scanner;

public class Exercise06EqualSumChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform 3 integer numbers: ");
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int n3 = keyboard.nextInt();
        System.out.println(hasEqualSum(n1,n2,n3));
        keyboard.close();
    }

    public static boolean hasEqualSum(int n1, int n2, int n3){
        if((n1+n2)==n3){
            return true;
        } else {
            return false;
        }
    }
}
