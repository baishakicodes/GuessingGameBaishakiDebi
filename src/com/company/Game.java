package com.company;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // write your code here
        Scanner hint = new Scanner(System.in);
        System.out.println("Pick a secret number from 1 to 100 and I'll try to guess it!");
        int myNum = hint.nextInt();
        int max = 100;
        int min = 1;
        int compGuess = 50;
        int tries = 0;
        System.out.println("Is your number "+compGuess+"?");
        while (myNum!=compGuess) {
            String userHint = hint.nextLine();
            if (userHint.equals("Too high")) {
                max = compGuess;
                compGuess = (min+max)/2;
                System.out.println("Is your number "+compGuess);
                tries++;
            } else {
                if (userHint.equals("Too low")) {
                    min = compGuess;
                    compGuess = (min + max) / 2;
                    System.out.println("Is your number "+compGuess);
                    tries++;

                }
            }
        }
        System.out.println("Your number is "+compGuess+"!");
        System.out.println("And I took "+tries+" guesses to get your number!");
    }
}





