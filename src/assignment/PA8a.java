package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PA8a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter input file: ");
		File inputFile = new File(scanner.nextLine());

		System.out.println("Enter output file: ");
		File outputFile = new File(scanner.nextLine());

		scanner.close();

		process(inputFile, outputFile);
	}

	public static void process(File inputFile, File outputFile) {
		try {
			Scanner inputScanner = new Scanner(inputFile);

			PrintWriter printWriter = new PrintWriter(outputFile);

			while (inputScanner.hasNextInt()) {

				int value = inputScanner.nextInt();

				if (value > 0) {
					printWriter.println(value);
				}
			}

			inputScanner.close();
			printWriter.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
