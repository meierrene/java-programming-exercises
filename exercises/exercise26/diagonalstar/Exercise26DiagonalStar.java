package de.renemeier.udemy.timbuchalka.exercises.exercise26.diagonalstar;

import java.util.Scanner;

public class Exercise26DiagonalStar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform a number: ");
        int number = keyboard.nextInt();
        printSquareStar(number);
        keyboard.close();
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || row == number || column == 1 || column == number) {
                        System.out.print("*");
                    } else if(row==column){
                        System.out.print("*");
                    }else if (column == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}