package assignment;

import java.util.Scanner;

public class PA1b {

    // DATA
	
	final static long feetToInches = 12;
	final static long yardToInches = 3 * feetToInches;

	// Code
	
	public static void main(String[] args) {
	
	    // Input	
	    System.out.print("How many inches do you have? ");
	    
	    Scanner scanner = new Scanner(System.in);
	    long inches = scanner.nextLong();
	   
	    scanner.close();
	   
		// Process    
	    long yards = inches / yardToInches;
	    inches = inches % yardToInches;
	   
	    long feets = inches / feetToInches;
	    inches = inches % feetToInches;
	    	  		
		// Output
	    System.out.println(yards + " " + "yard");
	    System.out.println(feets + " " + "feet");
	    System.out.println(inches + " " + "inch");	  
	}
	
}
