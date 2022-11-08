package inclass;

import java.util.Scanner;

public class Exam2Ex2 {

	public static void main(String[] args) {
		// Setup
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.print("Enter N: ");
		int n = scanner.nextInt();
		if (n < 0) {
			System.out.println("No factorial for negative numbers!");
			System.exit(0);
		}
		
		// Process
		long result = factorial(n);
		
		// Output
		System.out.printf("The factorial of %d is %d%n", n, result);

		// Cleanup
		scanner.close();
	}

	private static long factorial(int n) {
		if (n == 0)
			return 1;

		long result = 1;
		
		for (int i = 2; i <= n; i++)
			result *= i;
		
		return result;
	}

}
