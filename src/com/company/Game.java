package com.company;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // write your code here
        Scanner hint = new Scanner(System.in);
        System.out.println("Pick a secret number between 1 to 100 and I'll try to guess it!");
        int myNum = hint.nextInt();
        int max = 100;
        int min = 1;
        int compGuess = 50;
        int tries = 0;
        boolean correct = false;
        System.out.println("Is your number " + compGuess + "?");
        while (!correct) {
            String userHint = hint.nextLine();
            if (userHint.equals("Too high")) {
                max = compGuess;
                compGuess = (min + max) / 2;
                System.out.println("Is your number " + compGuess + "?");
                tries++;
            }
            if (userHint.equals("Too low")) {
                min = compGuess;
                compGuess = (min + max) / 2;
                System.out.println("Is your number " + compGuess + "?");
                tries++;
            }
            if(userHint.equals("Correct")){
                tries++;
                System.out.println("Yay, I got your number of "+compGuess+" in "+tries +" guesses!");
                correct = true;
            }
        }
    }
}







