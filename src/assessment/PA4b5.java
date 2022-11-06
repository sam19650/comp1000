package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b5 {

	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100 - 1) + 1;

		boolean correct = false;

		while (!correct) {
			System.out.print("Enter your guess (between 1 and 100): ");
			int guess = scanner.nextInt();

			// Process
			int test = 2;

			if (guess > 100 || guess < 1) {
				test = 0;
			} else if (guess < answer) {
				test = -1;
			} else if (guess > answer) {
				test = 1;
			} else {
				correct = true;
			}

			// Output
			if (test == 0) {
				System.out.println("Invalid guess, try again! ");
			} else if (test == -1) {
				System.out.println("Too low! ");
			} else if (test == 1) {
				System.out.println("Too high! ");
			}
		}
		scanner.close();
		System.out.println("You win! ");

	}

}
