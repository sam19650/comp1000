package inclass;

import java.util.Scanner;

public class OddEven {

	// Data
	
	
	// Code
	
	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		// Process
		int remainder = number % 2;
		
		boolean isEven = remainder == 0;
		
		// Output
		if (isEven) {
			System.out.println("The above number is even.");
		} else {
			System.out.println("The above number is odd");
		}

		System.out.println("End");
	}

}
