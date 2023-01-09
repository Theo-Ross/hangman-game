package org.example;

public class Results {

    private String computerResult = " ";
    private int lives = 5;


    public void finish() {


        if (lives < 1) {
            System.out.println("\uD83E\uDEA6 Unlucky - You've lost \uD83E\uDEA6");
        } else {
            System.out.println("\uD83E\uDD73 YOU ARE THE WINNER \uD83C\uDF89");
        }

    }

    public String getComputerResult() {
        return computerResult;
    }

    public void setComputerResult(String computerResult) {
        this.computerResult = computerResult;
    }

    public int getLives() {
        return lives;
    }

    public void setLives() {
        this.lives = 5;
    }


    public void decrementLives() {
        this.lives -= 1;
    }
}


