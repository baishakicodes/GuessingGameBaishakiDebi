package com.company;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // write your code here
        Scanner hint = new Scanner(System.in);
        int myNum = 35;
        int max = 100;
        int min = 1;
        int compGuess = 50;
        int tries = 0;
        while (myNum!=compGuess) {
            System.out.println("Is your number "+compGuess+"?");
            String userHint = hint.nextLine();
            if (userHint.equals("Too high")) {
                max = compGuess;
                compGuess = (min+max)/2;
                tries++;
            } else {
                if (userHint.equals("Too low")) {
                    min = compGuess;
                    compGuess = (min+max)/2;
                    tries++;
                }
            }
        }
        System.out.println("You guessed my number of "+myNum+"!");
        System.out.println("The computer took "+tries+" guesses to get my number!");
    }
}


