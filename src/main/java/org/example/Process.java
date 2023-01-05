package org.example;

public class Process {

    String guessedLetters;
    public static int lives = 5;
    String word = Words.chooseWord();


//    public static String guessLetter() {
//        String computerReturn = word.replaceAll("[^a]", "_")
//        return
//    }

    public static int looseLife(){
        return lives - 1;
    }
}
