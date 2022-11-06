package inclass;

import java.util.Scanner;

public class PA1a {
	// Data (Knowledge)
	
	final static int INCHES_PER_FOOT = 12;
	final static int FEET_PER_YARD = 3;
	final static int INCHES_PER_YARD = FEET_PER_YARD * INCHES_PER_FOOT;
	
	// Code (Control)
	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the number of yards, feet and inches: ");

		long yd = scanner.nextLong();
		long ft = scanner.nextLong();
		long in = scanner.nextLong();

		scanner.close();

		// Process

		long inches = yd * INCHES_PER_YARD + ft * INCHES_PER_FOOT + in;

		// Output

		System.out.println(inches + " total inches");

	}

}
