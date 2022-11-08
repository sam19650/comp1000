package inclass;

import java.util.Scanner;

public class Exam2Ex1 {

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);
		
		int maxSoFar = 0;
		
		boolean done = false;
		
		do {
			// Input
			System.out.print("Enter positive integers, stopping with zero or a negative number: ");
			int number = scanner.nextInt();
			
			// Process
			if (number > 0) {
				if (number > maxSoFar)
					maxSoFar = number;
			} else {
				done = true;
			}

		} while (!done);

		// Output
		System.out.printf("The max is %d%n", maxSoFar);
		
		// Cleanup
		scanner.close();
	}

}
