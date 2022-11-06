package inclass;

import java.util.Scanner;

public class OddEvenRevisited {

	// Data
	
	
	// Code
	
	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		// Process
		boolean isEven = isEven(number);
		
		// Output
		if (isEven) {
			System.out.println("The above number is even.");
		} else {
			System.out.println("The above number is odd");
		}

		System.out.println("End");
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
}
