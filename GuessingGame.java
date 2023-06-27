import java.util.Scanner;
import java.util.Random;
import java.lang.System;
import java.util.InputMismatchException;

public class GuessingGame {
  public GuessingGame() {

    System.out.println("Greetings!");
    System.out.println("What's your name?");
    Scanner input = new Scanner(System.in);

    String playerName = input.nextLine();
    Random random = new Random();
    int number = random.nextInt(100);
    
    System.out.println("Guess a number between 1 and 100: ");
    Scanner playerGuess = new Scanner(System.in);
    int numGuesses = 0;

    while (true) {
      int guess;
      try {
        guess = playerGuess.nextInt();
      }  catch (InputMismatchException e) {
      String badInput = input.next();
      System.out.println("That's not an integer. Try again");
      continue;
}

      if (guess < 1 || guess > 100) {
        System.out.println("That's not a valid number. Try again");
        continue;
      }

      numGuesses += 1;
    
      if (guess > number) {
        System.out.println("Too high. Guess again");
      } else if (guess < number) {
        System.out.println("Too low. Guess again");
      } else {
        System.out.println("That's right " + playerName);
        System.out.println("You got it right in " + numGuesses + " guesses");
        break;
      }
    }
  }
}