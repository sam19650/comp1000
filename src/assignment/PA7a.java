package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PA7a {

	public static final String FILE_NAME = "PA7a.txt";
	
	public static void main(String[] args) {
		File file = new File(FILE_NAME);
		
		try {
			Scanner scanner = new Scanner(file);

			int[] array = new int[100];
			
			int count = readIntoArray(scanner, array);
			
			int average = getAverage(array, count);
			
			printAboveAverage(array, count, average);
			
			scanner.close();
			
		} catch (FileNotFoundException exception) {
			System.out.printf("%s does not exist.%n", FILE_NAME);
			System.exit(0);
		} catch (InputMismatchException exception) {
			System.out.printf("%s is not valid.%n", FILE_NAME);
			System.exit(0);
		}
	}
	
	public static int readIntoArray(Scanner scanner, int[] array) {
		int index = 0;
		
		while (scanner.hasNext() && index < 100) {
			array[index] = scanner.nextInt();
			index++;
		}
		
		return index;
	}
	
	public static int getAverage(int[] array, int count) {
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			sum += array[i];
		}
		
		int average = 0;
		if (count > 0)
			average = sum / count;
		
		return average;
	}

	public static void printAboveAverage(int[] array, int count, int average) {
		for (int i = 0; i < count; i++) {
			if (array[i] > average) {
				System.out.println(array[i]);
			}
		}
	}

}
