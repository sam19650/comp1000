package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b7 {

	public static void main(String[] args) {
		// Input

		Random random = new Random();
		int myNum = random.nextInt(1, 100);

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your guess of a number 1-100: ");
		int userGuess = scanner.nextInt();

		// Process
		while (userGuess > myNum || userGuess < myNum) {
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Invalid guess! Try Again.");
				System.out.println("Enter your guess of a number 1-100: ");
				userGuess = scanner.nextInt();
			} else if (userGuess < myNum) {
				System.out.println("Too Low!");
				System.out.println("Enter your guess of a number 1-100: ");
				userGuess = scanner.nextInt();
			} else if (userGuess > myNum) {
				System.out.println("Too High.");
				System.out.println("Enter your guess of a number 1-100: ");
				userGuess = scanner.nextInt();
			}
			if (userGuess == myNum) {
				System.out.println("You win!");
				System.exit(0);
			}
		}

		// Output

	}

}
