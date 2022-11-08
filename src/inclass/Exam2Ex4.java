package inclass;

import java.util.Scanner;

public class Exam2Ex4 {

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);
		
		// Input
		int[] values = new int[10];
		System.out.print("Enter 10 integers: ");

		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		// Output
		System.out.println("The values in reverse order: ");
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(values[i]);
		}

		// Cleanup
		scanner.close();
	}

}
