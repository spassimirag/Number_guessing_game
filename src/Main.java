import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int generatedNumber = randomNumber.nextInt(100);
        int attemptsCounter = 0;

        System.out.println("Please pick a number between 0 and 100 and try to guess!");
        Scanner input = new Scanner(System.in);

        while (true) {

            int userGuess = input.nextInt();
            attemptsCounter++;

            if (generatedNumber == userGuess) {
                System.out.println(userGuess + " is the right number!");
                System.out.println("You guessed the number after " + attemptsCounter + " attempts.");
                break;

            } else if (generatedNumber < userGuess) {
                System.out.println("Actual number is lower than your input. Try again.");
            } else if (generatedNumber > userGuess) {
                System.out.println("Actual number is higher than your input. Try again.");
            }
        }

    }
}
