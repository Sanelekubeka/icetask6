import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 7; // fixed number between 1 and 10
        int guess = 0;

        System.out.println("Guess a number between 1 and 10:");

        // Keep looping until correct guess
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed it!");
            } else {
                System.out.println("Try again!");
            }
        }

        input.close();
    }
}
