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
		double min, max;
		
		if (x0 > x1) {
			min = x1;
			max = x0;
		} else {
			min = x0;
			max = x1;
		}
		
		if (x2 < min) {
			x0 = x2;
			x1 = min;
			x2 = max;
		} else if (x2 > max) {
			x0 = min;
			x1 = max;
		} else {
			x0 = min;
			x1 = x2;
			x2 = max;
		}
		
		// Output
		System.out.println("x0 = " + x0);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		// Cleanup
		scanner.close();
	}

}
