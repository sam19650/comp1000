package utility;

import java.util.Scanner;

public class Utility {

	public static boolean askUserYesNoQuestion(Scanner scanner, String question) {
		String response;
		do {
			System.out.print(question);
			response = scanner.next();
		} while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"));
		return response.equalsIgnoreCase("y");
	}
}
