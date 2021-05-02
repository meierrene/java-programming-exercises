package de.renemeier.udemy.timbuchalka.exercises.exercise11.playingcat;

import java.util.Scanner;

public class Exercise11PlayingCat {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Is the season summer? (false/true): ");
        boolean summer = keyboard.nextBoolean();
        System.out.print("\nInform the temperature: ");
        int temperature = keyboard.nextInt();
        boolean PlayingCat = isCatPlaying(summer,temperature);
        System.out.println(PlayingCat);
        keyboard.close();
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        }else{
            return temperature >= 25 && temperature <= 35;
        }
    }
}
