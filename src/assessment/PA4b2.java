package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b2 {

	public static void main(String[] args) {

		// Setup

		Random random = new Random();

		int target = random.nextInt(101);

		boolean done = false;

		String output = null;

		while (!done) {
			// Input
			System.out.print("Enter your guess (between 1 and 100): ");

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			int userGuess = scanner.nextInt();

			while (userGuess > 100 || userGuess < 0) {
				System.out.println("Invalid guess, try again!");
				userGuess = scanner.nextInt();
			}

			// Process
			if (userGuess == target) {
				output = "You Win!";
				done = true;
			}

			else if (userGuess > target) {
				output = "Too high!";
			}

			else {
				output = "Too low!";
			}
			// Output
			System.out.println(output);
		}
	}

}
