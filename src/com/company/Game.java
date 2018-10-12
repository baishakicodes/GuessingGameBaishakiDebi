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
        while (myNum!=compGuess) {
            System.out.println("Is your number "+compGuess+"?");
            String userHint = hint.nextLine();
            if (userHint.equals("Too high")) {
                max = compGuess;
                compGuess = (min+max)/2;
            } else {
                if (userHint.equals("Too low")) {
                    min = compGuess;
                    compGuess = (min+max)/2;
                }
            }
        }
        System.out.println("You guessed my number of "+myNum+"!");
    }
}


