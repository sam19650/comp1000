package inclass;

import java.util.Scanner;

public class MaxInteger {

	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter 5 integers separated by spaces: ");
		int x0 = scanner.nextInt();
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int x4 = scanner.nextInt();		
		scanner.close();
		
		// Process
		int maxSoFar;
		
		maxSoFar = x0;
		if (x1 > maxSoFar)
			maxSoFar = x1;
		if (x2 > maxSoFar)
			maxSoFar = x2;
		if (x3 > maxSoFar)
			maxSoFar = x3;
		if (x4 > maxSoFar)
			maxSoFar = x4;

		int maxInteger = maxSoFar;
		
		// Output
		System.out.println("The maximum integer is " + maxInteger);
	}

}
