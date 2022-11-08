package inclass;

import java.util.Scanner;

public class Convert {

	// Data
	
	final static long kiloBytes = 1024;
	final static long megaBytes = 1024 * kiloBytes;
	final static long gigaBytes = 1024 * megaBytes;
	
	// Code
	
	public static void main(String[] args) {

		// Input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the number of free bytes: ");
		
		long bytes = scanner.nextLong();
		
		scanner.close();
		
		// Process		
		long Gb = bytes / gigaBytes;
		
		long remainder = bytes % gigaBytes;

		long Mb = remainder / megaBytes;
		
		remainder = remainder % megaBytes;
		
		long Kb = remainder / kiloBytes;

		// Output
		System.out.println(Gb + " " + "Gb");
		System.out.println(Mb + " " + "Mb");
		System.out.println(Kb + " " + "Kb");
	}

	int doSomething(float x) {
		return 0;
	}

}
