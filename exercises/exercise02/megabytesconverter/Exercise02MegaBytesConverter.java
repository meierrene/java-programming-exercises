package de.renemeier.udemy.timbuchalka.exercises.exercise02.megabytesconverter;

import java.util.Scanner;

public class Exercise02MegaBytesConverter {
    public static void main(String[] args) {
        System.out.print("KB = ");
        Scanner keyboard = new Scanner(System.in);
        int kiloBytes =keyboard.nextInt();
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remaningkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaningkilobytes + " KB");
        }
        keyboard.close();
    }
}