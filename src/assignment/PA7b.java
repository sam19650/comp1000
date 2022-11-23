package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PA7b {

	public static final int ALPHABET_SIZE = 26;
	
	public static final String FILE_NAME = "PA7b.txt";
			
	public static void main(String[] args) {

		int[] letterFrequency = new int[ALPHABET_SIZE];
		
		File file = new File(FILE_NAME);
		
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					
					int index = getCharIndexIgnoreCase(c);
					if (index >= 0)
						letterFrequency[index]++;
				}
			}
			scanner.close();
			
		} catch (FileNotFoundException exception) {
			System.out.println("File not found!");
		}
		
		// Output
		for (int i = 0; i < letterFrequency.length; i++) {
			System.out.printf("%c %6d%n", getCharFromIndex(i),
					letterFrequency[i]);
		}
	}

	private static int getCharIndexIgnoreCase(char c) {
		int index;
		
		if (c >= 'a' && c <= 'z' )
			index = c - 'a';
		else if (c >= 'A' && c <= 'Z')
			index = c - 'A';
		else 
			index = -1;
		
		return index;
	}

	private static char getCharFromIndex(int index) {
		return (char) ('A' + index);
	}

}
