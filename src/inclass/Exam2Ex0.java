package inclass;

import java.util.Scanner;

public class Exam2Ex0 {

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);
		
		// Input
		System.out.print("Enter 3 numbers separated by whitespaces: ");
		double x0 = scanner.nextDouble();
		double x1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		
		// Process
		double minimum, maximum;
		
		if (x0 > x1) {
			minimum = x1;
			maximum = x0;
		} else {
			minimum = x0;
			maximum = x1;
		}

		if (x2 > maximum) {
			x0 = minimum;
			x1 = maximum;
		} else if (x2 < minimum) {
			x0 = x2;
			x1 = minimum;
			x2 = maximum;
		} else {
			x0 = minimum;
			x1 = x2;
			x2 = maximum;
		}

		// Output
		System.out.println("x0 = " + x0);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		// Cleanup
		scanner.close();
	}

}
