package inclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIntegersFromFile {

	public static final String FILE_NAME = "PA7a.txt";
	
	public static void main(String[] args) {

		File file = new File(FILE_NAME);
		
		try {
			Scanner scanner = new Scanner(file);

			int sum = 0;
			int count = 0;
			
			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				sum += value;
				count++;
			}			
			scanner.close();

			int average = sum / count;
			
			System.out.printf("Sum = %d%n", sum);
			System.out.printf("Average = %d%n", average);
			
		} catch (FileNotFoundException exception) {
			System.out.printf("%s not found!%n", FILE_NAME);
			System.exit(0);
		}

	}

	public static int readIntoArray(Scanner scanner, int[] values) {

		int count = 0;
		
		while (scanner.hasNextInt()) {
			int value = scanner.nextInt();
			
			values[count] = value;
			
			count++;
		}

		return count;
	}

}
