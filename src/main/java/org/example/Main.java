package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

        private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

          ArrayList<Character> letters = new ArrayList<>();
          ArrayList<Character> guesses = new ArrayList<>();

          int lives = 5;

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

        System.out.println("Pick a letter");
        char letterInput = scanner.next().charAt(0);

        if (word.contains(Character.toString(letterInput))) {
            letters.add(letterInput);
            System.out.println(letters);
        } else {
            guesses.add(letterInput);
            lives -= 1;
            System.out.println("Incorrect - lose a life - lives:" + lives);
        }

        String computerResult = word.replaceAll("[^" + letters + "]", "_");
        System.out.println(computerResult);


        System.out.println("Pick a letter");
        char letterInput2 = scanner.next().charAt(0);

        if (word.contains(Character.toString(letterInput2))) {
            letters.add(letterInput2);
            System.out.println(letters);
        } else {
            guesses.add(letterInput2);
            lives -= 1;
            System.out.println("Incorrect - lose a life - lives:" + lives);
        }

        String computerResult2 = word.replaceAll("[^" + letters + "]", "_");

        System.out.println(computerResult2);


        System.out.println("Pick a letter");
        char letterInput3 = scanner.next().charAt(0);

        if (word.contains(Character.toString(letterInput3))) {
            letters.add(letterInput3);

        } else {
            guesses.add(letterInput3);
            lives -= 1;
            System.out.println("Incorrect - lose a life - lives:" + lives);
        }
        System.out.println(guesses);
        String computerResult3 = word.replaceAll("[^" + letters + "]", "_");

        System.out.println(computerResult3);

    }
}