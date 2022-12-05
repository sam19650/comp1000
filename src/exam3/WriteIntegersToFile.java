package exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntegersToFile {

	private static final String FILE_NAME = "output.txt";
	
	public static void main(String[] args) {

		File file = new File(FILE_NAME);
		
		try {
			System.out.println("Printing to file...");

			PrintWriter out = new PrintWriter(file);
			
			for (int i = 0; i < 10000; i++)
				out.println(i);
			
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.printf("%s not found!%n", FILE_NAME);
			System.exit(0);
		}

		System.out.println("Done");
	}

}
