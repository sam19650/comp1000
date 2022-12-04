package exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadIntegersFromFile {

	public static final String FILE_NAME = "PA7a.txt";
	
	public static void main(String[] args) {

		File file = new File(FILE_NAME);
		
		try {
			Scanner scanner = new Scanner(file);

			int sum = 0;
			int count = 0;
			
			while (scanner.hasNext()) {
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
		} catch (InputMismatchException exception) {
			System.out.printf("%s invalid!%n", FILE_NAME);
			System.exit(0);
		}

	}

}
