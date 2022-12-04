package exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tokenizer {

	public static final String FILE_NAME = "tokens.txt";

	public static void main(String[] args) {

		File file = new File(FILE_NAME);
		
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				String token = scanner.next();
				System.out.println(token);
			}
			
			scanner.close();
			
		} catch (FileNotFoundException exception) {
			System.out.printf("%s does not exist.%n", FILE_NAME);
			System.exit(0);
		}
	}

}
