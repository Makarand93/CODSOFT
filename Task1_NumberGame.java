// Task1_NumberGame.java

import java.util.Random;
import java.util.Scanner;

public class Task1_NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int score = 0;
        int rounds = 0; 
        char playAgain;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {
            rounds++;

            int number = r.nextInt(100) + 1;   // 1 to 100
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nRound " + rounds);
            System.out.println("Guess the number between 1 and 100");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");

                
                if (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    sc.next(); // clear invalid input
                    continue;
                }

                guess = sc.nextInt();

               
                if (guess < 1 || guess > 100) {
                    System.out.println("Enter number only between 1 and 100!");
                    continue;
                }

                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You won.");

                    int points = (maxAttempts - attempts + 1) * 10;
                    score += points;

                    System.out.println("You earned: " + points + " points");
                    break;
                }
                else if (guess > number) {
                    System.out.println("Too High!");
                }
                else {
                    System.out.println("Too Low!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (guess != number) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
