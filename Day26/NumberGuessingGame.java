package Day26;

import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int secret = (int) (Math.random() * 10 + 1);

    System.out.println(" welcome to the number guessing game!");
    System.out.println("There is a number between 1-10. Try to guess it!");
    int guess;
    int attempt = 1;

    do {
      System.out.println("enter your guess");
      guess = sc.nextInt();

      if (guess < 1 || guess > 10) {
        System.out.println("Please enter a number between 1 and 10.");
      }

      else if (guess == secret) {
        System.out.println("Congratulations your guess was correct");
        System.out.println("total no. of attempt you took " + attempt);
      }

      else {
        System.out.println("your guess was incorrect. Try Again!");
        attempt++;
      }
    } while (guess != secret);
    sc.close();
  }
}