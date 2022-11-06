package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b6 {

	public static void main(String[] args) {

		// Setup
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		int guess;
		boolean done = false;
		while (!done) {
			// Input
			System.out.println("Enter your guess (between 1 and 100): ");
			guess = scanner.nextInt();
			// Process
			if (guess == randomNumber) {
				done = true;
				System.out.println("You win!");
				System.exit(0);
			}
			// Output
			else if (guess < randomNumber) {
				System.out.println("Too low!");
			} else if (guess > randomNumber) {
				System.out.println("Too high!");
			}
		}
		// Cleanup
		scanner.close();
	}
}
