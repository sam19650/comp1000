package assessment;

import java.util.Random;
import java.util.Scanner;

public class PA4b3 {

	public static void main(String[] args) {

		Random randI = new Random();
		int myRandInt = randI.nextInt(100);
		myRandInt = myRandInt + 1;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Guess an Integer between 1 and 100: ");
		int userInput = scanner.nextInt();

		while (userInput != myRandInt) {

			if (userInput < 1 || userInput > 100) {
				System.out.println("Well.. now your just not playing the game right. Come again.");
				System.exit(0);
			}

			if (userInput < myRandInt) {
				System.out.println("Congratulations you guessed incorrectly! Too Low! Take another crack at it!? ");
			}
			if (userInput > myRandInt) {
				System.out.println("Congratulations you guessed incorrectly! Too High! Take another crack at it!? ");
			}

			System.out.print("Guess an Integer between 1 and 100: ");
			userInput = scanner.nextInt();

		}
		
		if (userInput == myRandInt) {
			System.out.println("Congratulations you guessed correctly!");
			System.out.println("You won nothing but this is your number: " + userInput);
			scanner.close();
			System.exit(0);
		}
	}

}
