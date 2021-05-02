package de.renemeier.udemy.timbuchalka.exercises.exercise29.simplecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator Calculator = new SimpleCalculator();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the first number: ");
        int firstNumber = keyboard.nextInt();
        Calculator.setFirstNumber(firstNumber);
    }
}
