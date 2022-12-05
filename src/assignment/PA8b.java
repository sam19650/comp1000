package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PA8b {

	public static void main(String[] args) {
		// Setup
		Scanner scan = new Scanner(System.in);

		// Input
		System.out.println("Enter file path: ");
		File file = new File(/* Scan.nextLine() */
				"C:\\Users\\Rabih Elmassih\\eclipse-workspace\\myComp1000\\programmingassignment8\\DataInput.txt");

		// Cleanup
		scan.close();

		// Process
		readFromFile(file);
	}

	public static void readFromFile(File file) {
		try {
			Scanner scanner = new Scanner(file);

			int low = 0;
			int high = 0;

			while (scanner.hasNext()) {

				int num = scanner.nextInt();

				if (num < low) {
					low = num;
				} else if (num > high) {
					high = num;
				}
			}

			printRange(file, low, high);

			// cleanup
			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (InputMismatchException e) {
			System.out.println("File not valid");
		}
	}

	public static void printRange(File file, int low, int high) {
		if (low != high)
			System.out.println(file.getName() + " Range: " + low + " to " + high);
		else
			System.out.println(file.getName() + " Range: " + low);
	}

}
