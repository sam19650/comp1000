package inclass;

import java.util.Scanner;

public class AskYesNoQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean result = askYesNoQuestion(scanner, "Are you in good mood?");

		scanner.close();

		System.out.println(result);

	}

	public static boolean askYesNoQuestion(Scanner scanner, String question) {
		String response;
		do {
			System.out.print(question + " (Y/N) ");
			response = scanner.next();
		} while (response.compareToIgnoreCase("y") != 0 && response.compareToIgnoreCase("n") != 0);
		return response.compareToIgnoreCase("y") == 0;
	}

}
