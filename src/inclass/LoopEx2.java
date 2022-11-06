package inclass;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter length: ");

		int length = scanner.nextInt();
		
		if (length < 0) {
			System.out.println("Invalid length");
			System.exit(0);
		}

		double[] values = new double[length];
		
		for (int i = 0; i < values.length; i++) {
			System.out.print("Please enter a value: ");
			values[i] = scanner.nextDouble();
		}

		scanner.close();
		
		System.out.println("You typed the following values:");
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		// Process
		double sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		double average = sum / values.length;
		
		// Output
		System.out.printf("Average = %.2f\n", average);
		
	}

}
