package org.example;

public class Results {

    private String computerResult = " ";
   private int lives = 5;

   public void finish(){

        if (lives<1) {
            System.out.println("Unlucky - You've lost");
        } else {
            System.out.println("YOU ARE THE WINNER");
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



    public void decrementLives(){
        this.lives -= 1;
    }
}


