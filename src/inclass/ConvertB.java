package inclass;

import java.util.Scanner;

public class ConvertB {
	
	// Data
	
	final static long kiloBytes = 1024;
	final static long megaBytes = 1024 * kiloBytes;
	final static long gigaBytes = 1024 * megaBytes;

	// Code
	
	public static void main(String[] args) {
		// Input
		System.out.print("How many free bytes? ");
		
		Scanner scanner = new Scanner(System.in);
		long bytes = scanner.nextLong();
		
		scanner.close();

		// Process
		long Gb = bytes / gigaBytes;
		bytes = bytes % gigaBytes;
		
		long Mb = bytes / megaBytes;
		bytes = bytes % megaBytes;
		
		long Kb = bytes / kiloBytes;
		bytes = bytes % kiloBytes;
		
		// Output
		System.out.println(Gb + " " + "Gb");
		System.out.println(Mb + " " + "Mb");
		System.out.println(Kb + " " + "Kb");
		System.out.println(bytes + " " + "B");
	}
}
