package inclass;

import java.util.Scanner;

public class LetterGradeRedux {

	// Data
	final static char A_GRADE = 'A';
	final static int A_LOW = 89;
	final static int A_HIGH = 100;

	final static char B_GRADE = 'B';
	final static int B_LOW = 80;
	final static int B_HIGH = 88;

	final static char C_GRADE = 'C';
	final static int C_LOW = 70;
	final static int C_HIGH = 79;

	final static char D_GRADE = 'D';
	final static int D_LOW = 60;
	final static int D_HIGH = 69;

	final static char F_GRADE = 'F';

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

		if (score >= A_LOW && score <= A_HIGH)
			letterGrade = A_GRADE;
		else if (score >= B_LOW && score <= B_HIGH)
			letterGrade = B_GRADE;
		else if (score >= C_LOW && score <= C_HIGH)
			letterGrade = C_GRADE;
		else if (score >= D_LOW && score <= D_HIGH)
			letterGrade = D_GRADE;
		else
			letterGrade = F_GRADE;

		// Output
		System.out.println("Your letter grade is " + letterGrade);
	}

}
