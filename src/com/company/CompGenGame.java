package com.company;

import java.awt.*;
import java.util.Scanner;

public class CompGenGame {
    public static void main(String[] args) {
        int compNum = (int) (Math.random() * 10 + 1);
        Scanner num = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10:");
        int guess = num.nextInt();
        int tries = 0;
        while (guess != compNum) {
            System.out.println("That's not correct! Guess Again:");
            guess = num.nextInt();
            tries++;
        }
        System.out.println("You guessed correctly!");
        System.out.println("You took "+tries+" tries to guess my number correctly!");
    }
}
