package org.example;

import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Hangman press Enter to play");
        String startPlay = scanner.nextLine();
        if (startPlay.contains("Enter")) {
            System.out.println("Let's Begin!");

        } else {
            System.out.println("Welcome to Hangman press Enter to play");
        }



    }
}