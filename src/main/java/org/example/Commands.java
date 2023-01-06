package org.example;

import java.util.Scanner;

public class Commands {

  private  Scanner scanner = new Scanner(System.in);


    public char pickLetter() {

      return scanner.next().charAt(0);
    }

    public String beginGame() {
        return scanner.nextLine();
    }
}
