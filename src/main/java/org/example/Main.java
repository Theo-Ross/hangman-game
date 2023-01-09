package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean playing = true;

        Scanner scanner = new Scanner(System.in);


        Game game = new Game();

        while (playing) {
            System.out.println("Welcome to Hangman press Enter to play");
            game.startGame();

            System.out.println("Would you like to play again? Y/N");
            if (scanner.nextLine().equals("N")) {
                playing = false;
            }


            System.out.println("Ok, thank you for playing");


        }
    }}