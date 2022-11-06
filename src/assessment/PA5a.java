package assessment;

import java.util.Scanner;

public class PA5a {

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);

		String userAnswer;

		do {
			// Process
			double average = getAverageOfStreamOfPositiveNumbers(scanner);

			// Output
			System.out.printf("The average is : %.2f%n", average);

			// Input
			System.out.print("Do you want to compute another average? (y/n) ");
			userAnswer = scanner.next();

		} while (userAnswer.compareToIgnoreCase("y") == 0);

		// Cleanup
		scanner.close();
	}

	public static double getAverageOfStreamOfPositiveNumbers(Scanner scanner) {
		// Input
		System.out.print("Enter a stream of non-negative numbers (negative when finshed): ");

		boolean done = false;

		double sum = 0.0;
		int count = 0;

		do {
			double value = scanner.nextDouble();

			// Process
			if (value >= 0) {
				sum += value;
				count++;
			} else {
				done = true;
			}

		} while (!done);

		// Output
		if (count == 0)
			return 0;

		return sum / count;
	}

}
