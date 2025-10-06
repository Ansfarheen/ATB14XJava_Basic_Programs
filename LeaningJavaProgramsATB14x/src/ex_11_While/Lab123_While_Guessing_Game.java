package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numToGuess = random.nextInt(100) + 1;
        System.out.println(numToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int guess;
        int attempts = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number ");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100");
                continue;
            }

            if (guess > numToGuess) {
                System.out.println("Too high, try again");
            }
            else if (numToGuess > guess){
                System.out.println("Too low, try again");
            }
            else{
            System.out.println("Correct!! you guessed it. Total attempts are " + attempts);
            break;
            }
        }
    }

    }

