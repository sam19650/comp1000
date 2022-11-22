package inclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Type {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Syntax: java Type.java <fileName>");
			System.exit(0);
		}

		File file = new File(args[0]);
		
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			
			scanner.close();

		} catch (FileNotFoundException exception) {
			System.out.println("File not found!");
		}
		
	}

}
