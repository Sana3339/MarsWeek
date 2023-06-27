import java.util.Scanner;
import java.util.Random;
import java.lang.System;

public class GuessingGame {

  public static void main(String[] args) {

    System.out.println("Greetings!");
    System.out.println("What's your name?");
    Scanner input = new Scanner(System.in);

    String playerName = input.nextLine();
    Random random = new Random();
    int number = random.nextInt(100);
    
    System.out.println("Guess a number between 1 and 100: ");
    Scanner playerGuess = new Scanner(System.in);
    int guess = playerGuess.nextInt();
    int numGuesses = 1;

    while (guess != number) {
      if (guess > number) {
        System.out.println("Too high. Guess again");
      } else {
        System.out.println("Too low. Guess again");
      }
      guess = playerGuess.nextInt();
        numGuesses++;
    }
    System.out.println("That's right " + playerName);
    System.out.println("You got it right in " + numGuesses + " guesses");
  }
}