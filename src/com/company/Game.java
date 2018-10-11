package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
	// write your code here
        Scanner num = new Scanner (System.in);
        System.out.print("Guess a number:");
        int guess = num.nextInt();
        while(guess != 5){
            System.out.print("Guess again:");
            guess = num.nextInt();
        }
        System.out.println("You guessed correctly!");
    }
}
