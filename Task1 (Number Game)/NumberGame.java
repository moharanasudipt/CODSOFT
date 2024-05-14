import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        int score = 0;
        int maxAttempts = 5; 
        boolean playAgain = true;

        Scanner sc = new Scanner(System.in);

        while (playAgain) {
            attempts = 0;
            secretNumber = random.nextInt(100) + 1; 

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    score = attempts;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You didn't guess the correct number. The correct answer was " + secretNumber);
            }

            System.out.println("You took " + attempts + " attempts to guess the correct number.");
            System.out.println("Your score is " + score);

            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();

            if (response.equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }
    }
}