package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PA5a {

	public static void main(String[] args) {
		
		// Input
		
		var scanner = new Scanner(System.in);
		
		
		
		// Process
		while(true) {
			var lst = new ArrayList<Integer>();
			System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
			while(true) {
				int input = scanner.nextInt();
				if (input >= 0) {
					lst.add(input);
				} else if (input < 0){
					break;
				}

			}
			
			int sum = 0 ;
			for (int i = 0; i < lst.size(); i++) {
				sum = sum + lst.get(i);
			}
			
			double average;
			
			if (lst.size() != 0) {
				average = (double)sum/lst.size();

				System.out.printf("The average is: %.2f%n", average);
			} else {
				System.out.printf("The average is: %.2f%n", 0.00);
			}
			// output 
			
			System.out.println("Do you want to compute another average (y/n)?");
			String value = scanner.next();
			if (value.equals("N")) {
				break;
			} else if (value.equals("Y")) {
				continue; 
			}
		}
		scanner.close();
		
	}	
}
