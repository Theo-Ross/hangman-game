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
            System.out.println("  |       O");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 2) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            System.out.println("  |       |");
            System.out.println("  | ");
            System.out.println("__|__");
        }
        if (lives == 1) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |     __O__");
            System.out.println("  |       |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 0) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |     __O__");
            System.out.println("  |       |");
            System.out.println("  |     _| |_");
            System.out.println("__|__");
        }
    }
}
