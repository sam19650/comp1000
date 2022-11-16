package inclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileBasedScanner {

	public static void main(String[] args) {

		File file = new File("data.txt");
		
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				System.out.println(value);
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {

			System.out.println(e);
		}
		
		System.out.println("Done");
	}

	
}
