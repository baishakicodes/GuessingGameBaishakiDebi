package com.company;

import java.awt.*;
import java.util.Scanner;

public class CompGenGame {
    public static void main(String[] args) {
        int compNum = (int) (Math.random()*100+1);
        Scanner num = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");
        int guess = num.nextInt();
        while(guess != compNum){
            if(guess > compNum) {
                System.out.println("That number is too high!");
                guess = num.nextInt();
            }
            else {
                System.out.println("That number is too low!");
                guess = num.nextInt();

            }

        }
        System.out.println("You guessed correctly!");


    }
}
