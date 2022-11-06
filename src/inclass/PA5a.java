package inclass;

import java.util.Scanner;

import utility.Utility;

public class PA5a {

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);

		do {
			// Step 1
			double average = getAverageOfStreamOfPositiveNumbers(scanner);

			// Step 2
			System.out.printf("The average is: %.2f%n", average);

		} while (Utility.askUserYesNoQuestion(scanner, "Do you want to compute another average (y/n)? "));

		// Cleanup
		scanner.close();
	}

	private static double getAverageOfStreamOfPositiveNumbers(Scanner scanner) {

		// Step 1
		double sum;

		// Step 2
		sum = 0;

		// Step 3
		int count;

		// Step 4
		count = 0;

		// Step 5
		System.out.print("Enter a stream of non-negative numbers (negative when finished): ");

		boolean done = false;
		do {
			double number = scanner.nextDouble();

			// Step 6
			if (number >= 0) {
				// Step 6-a
				sum += number;
				// Step 6-b
				count++;
				// Step 6-c
			} else {
				done = true;
			}

		} while (!done);

		// Step 7
		if (count == 0)
			return 0.0;

		// Step 8
		return sum / count;
	}

}
