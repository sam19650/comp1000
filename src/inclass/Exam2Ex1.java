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
			System.out.print("Enter a positive integer (zero or negative integer to stop): ");
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
		System.out.println("Maximum is " + maxSoFar);
		
		// Cleanup
		scanner.close();
	}

}
