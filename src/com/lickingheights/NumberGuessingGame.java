package com.lickingheights;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner keybored;
        int pickedNumber;
        int guessedNumber;
        boolean youGotIt;

        keybored = new Scanner(System.in);
        pickedNumber = (int) (Math.random() * 100);
        System.out.println(pickedNumber);
        youGotIt = false;

        System.out.println("hello this is a number guessing game");
        System.out.println("The rules are simple");
        System.out.println("guess a number and if its to high it will say too high guess again");
        System.out.println("guess a number and if its to low it will say too low guess again");
        //System.out.println("so guess a number");
        //guessedNumber = keybored.nextInt();

        while (!youGotIt) {
            System.out.println("guess a number");
            guessedNumber = keybored.nextInt();

            System.out.println("thank you for playing my number guessing game");
            if (guessedNumber < pickedNumber) {
                System.out.println("your number is too low");

            } else if (guessedNumber > pickedNumber) {
                System.out.println("your number is too high");

            } else  {
                System.out.println("you got it right");

                youGotIt = true;



            }
        }
    }
}
