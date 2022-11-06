package inclass;

import java.util.Scanner;

public class LetterGrade {

	// Data

	// Code

	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your score: ");

		int score = scanner.nextInt();

		scanner.close();

		boolean valid = score >= 0 && score <= 100;

		if (!valid) {
			System.out.println("Invalid score!");
			System.exit(0);
		}

		// Process
		char letterGrade;

		if (score >= 90)
			letterGrade = 'A';
		else if (score >= 80)
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';

		// Output
		System.out.println("Your letter grade is " + letterGrade);
	}

}
