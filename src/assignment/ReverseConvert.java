package assignment;

import java.util.Scanner;

public class ReverseConvert {

	// Data
	
	final static long kiloBytes = 1024;
	final static long megaBytes = 1024 * kiloBytes;
	final static long gigaBytes = 1024 * megaBytes;
	
	// Code
	
	public static void main(String[] args) {

		// Input
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter number of Gb, Mb and Kb: ");
		
		long Gb = scanner.nextLong();
		long Mb = scanner.nextLong();
		long Kb = scanner.nextLong();
		
		scanner.close();
		
		// Process
		long bytes = Gb * gigaBytes + Mb * megaBytes + Kb * kiloBytes;

		// Output
		System.out.println(bytes + " " + "bytes");
	}

}
