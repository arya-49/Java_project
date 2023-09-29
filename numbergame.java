import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        // Let's play the number guessing game

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");

        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is " + randomNumber);

        int tryCount = 0;
        while (true) {
            System.out.println("Enter Your Guess: ");
            int guess = sc.nextInt();
            tryCount++;

            if (guess == randomNumber) {
                System.out.println("Hurrah! You Win!");
                System.out.println("It took you " + tryCount + " tries.");
                break;
            } else if (randomNumber > guess) {
                System.out.println("The number is greater than " + guess + " Guess again");
            } else {
                System.out.println("The number is lower than " + guess + " Guess again.");
            }
        }

        System.out.println("Your score is " + ((10 - tryCount) * 10) + " out of 100");
        sc.close();
    }

}