package org.example;

public class Image {


    public  void hangingMan(int lives) {

        if (lives == 4) {
            System.out.println("  ________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 3) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       \uD83D\uDE29");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 2) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       \uD83D\uDE22");
            System.out.println("  |       |");
            System.out.println("  | ");
            System.out.println("__|__");
        }
        if (lives == 1) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |     __\uD83D\uDE2D__");
            System.out.println("  |       |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 0) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |     __\uD83D\uDC80__");
            System.out.println("  |       |");
            System.out.println("  |     _| |_");
            System.out.println("__|__");
        }
    }
}
