import java.util.Random;
import java.util.Scanner;
public class DecodeLabs_Java_P1{
    public static void main(String[] args){
    Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int secretNumber = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 100.");
            while (guess != secretNumber) {
                System.out.println("Enter your guess");

                if (!sc.hasNextInt()) {
                    if (!sc.hasNext()) {
                        break;
                    }
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                    sc.next();
                    continue;
                }

                guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;
                if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct guess!");
                    System.out.println("Number of attempts: " + attempts);
                }
            }
        }
    }
}