package assessment;

import java.util.Scanner;

import java.util.Random;

public class PA4b4 {

	public static void main(String[] args) {

		int guess;

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		final int randomNumber = random.nextInt(1, 101);

		while (true) {
			System.out.print("Enter your guess (between 1 and 100): "); // Input
			guess = scanner.nextInt();
			if (guess == randomNumber) {
				scanner.close();
				break;
			}

			// Process

			if (guess > 100 || guess < 1)
				System.out.println("Invalid guess, try again!");
			if (guess > randomNumber && guess < 101)
				System.out.println("Too high!");
			if (guess < randomNumber && guess > 0)
				System.out.println("Too low!");
		}

		// Output

		System.out.println("You win!");

	}

}
