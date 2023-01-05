package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

        private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Character> guessedLetters = new ArrayList<>();

    static {

    };

    public static void main(String[] args) {

        System.out.println("Welcome to Hangman press Enter to play");
        String startPlay = scanner.nextLine();
//        if (startPlay.contains("ee")) {
//            System.out.println("Let's Begin!");
          String word = Words.chooseWord();
            System.out.println(word);
            StringBuilder underscores = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                underscores.append("_");
            }
            String result = underscores.toString();
            System.out.println(result);

//        } else {
//            System.out.println("Welcome to Hangman press Enter to play");
//        }

        System.out.println("Pick a letter");
        char letterInput = scanner.next().charAt(0);

        String computerResult = word.replaceAll("[^" + letterInput + "]", "_");

        System.out.println(computerResult);

        if (computerResult == result) {
            System.out.println("YOU LOOSE A LIFE");
            Process.looseLife();
            System.out.println("Lives:" + Process.lives);
            guessedLetters.add(letterInput);
        } else {
            System.out.println("Congratulations that is correct");
            System.out.println("Lives:" + Process.lives);
        }

        System.out.println("Pick a letter");
        char letterInput2 = scanner.next().charAt(0);

        String computerResult1 = word.replaceAll("[^" + letterInput + letterInput2 + "]", "_");

        System.out.println(computerResult1);

        if (computerResult == computerResult1) {
            System.out.println("YOU LOOSE A LIFE");
            Process.looseLife();
            System.out.println("Lives:" + Process.lives);
            guessedLetters.add(letterInput2);
        } else {
            System.out.println("Congratulations that is correct");
            System.out.println("Lives:" + Process.lives);
        }



    }
}