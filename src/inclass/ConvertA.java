package inclass;

import java.util.Scanner;

public class ConvertA {
	
	// Data
	
	final static long kiloBytes = 1024;
	final static long megaBytes = 1024 * kiloBytes;
	final static long gigaBytes = 1024 * megaBytes;

	// Code
	
	public static void main(String[] args) {
		// Input
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many Gb? ");
		long Gb = scanner.nextLong();
		
		System.out.print("How many Mb? ");
		long Mb = scanner.nextLong();

		System.out.print("How many Kb? ");
		long Kb = scanner.nextLong();

		System.out.print("How many bytes? ");
		long bytes = scanner.nextLong();

		scanner.close();
		
		// Process
		bytes = Gb * gigaBytes + Mb * megaBytes + Kb * kiloBytes + bytes;
		
		// Output
		System.out.println(bytes + " " + "bytes");
	}
}
