package assignment;

import java.util.Scanner;

public class PA4a {

	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the current price of the item: $");
		double price = scanner.nextInt();
		System.out.print("Enter the number of years: ");
		int years = scanner.nextInt();
		System.out.print("Enter the inflation rate as a percentage: ");
		double inflation = (double) scanner.nextInt() / 100 + 1;
		scanner.close();
		//process
		for (int i = 1; i <= years; i++) {
			price *= inflation;
		}
		//output
		System.out.printf("After " + years + " years, the price will be $%.2f", price);
	}

}
