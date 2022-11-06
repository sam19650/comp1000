package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b1 {

	public static void main(String[] args) {
		// Input

		Random random = new Random();
		int randomNumber = random.nextInt(99) + 1;

		Scanner scanner = new Scanner(System.in);

		boolean correctGuess = false;

		while (!correctGuess) {

			System.out.println("Enter your guess: ");
			int guess = scanner.nextInt();
			// string
			if (guess > 100 || guess < 1)
				System.out.println("Invalid guess my friend. ");
			else if (guess > randomNumber)
				System.out.println("Too High!!");
			else if (guess < randomNumber)
				System.out.println("Too Low!!");
			else if (guess == randomNumber) {
				System.out.println("You Win!!!!!!");
				correctGuess = true;
			}

			// print

		}
		scanner.close();

		System.out.println("The number is: " + randomNumber);
	}

}
