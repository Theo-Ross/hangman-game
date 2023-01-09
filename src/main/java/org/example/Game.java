package org.example;

import java.util.ArrayList;


public class Game {

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> guesses = new ArrayList<>();

    Results results = new Results();

    Commands commands = new Commands();

    Words words = new Words();


    Image image = new Image();
    public void startGame() {

        guesses.clear();
        letters.clear();
        results.setLives();

        words.setWord();

        System.out.println(words.getWord());
        StringBuilder underscores = new StringBuilder();
        for (int i = 0; i < words.getWord().length(); i++) {
            underscores.append("_");
        }
        String result = underscores.toString();
        System.out.println(result);


        while (results.getLives() >= 1 && !results.getComputerResult().equals(words.getWord())) {

            System.out.println("Pick a letter:");
            char letterInput = commands.pickLetter();

            if (words.getWord().contains(Character.toString(letterInput))) {
                System.out.println("Correct! - lives:" + results.getLives());
                letters.add(letterInput);
                System.out.println(guesses);
                results.setComputerResult(words.getWord().replaceAll("[^" + letters + "]", "_"));
                System.out.println(results.getComputerResult());

            } else {
                guesses.add(letterInput);
                results.decrementLives();
                System.out.println("Incorrect - lose a life - lives:" + results.getLives());
                image.hangingMan(results.getLives());
                System.out.println(guesses);
                System.out.println(results.getComputerResult());
            }

        }

        results.finish();



    }



}



