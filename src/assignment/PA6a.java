package assignment;

import java.util.Scanner;

public class PA6a {

	// Knowledge
	static final int MONTHS_PER_YEAR = 12;

	static final int JANUARY = 0;
	static final int FEBRUARY = 1;
	static final int MARCH = 2;
	static final int APRIL = 3;
	static final int MAY = 4;
	static final int JUNE = 5;
	static final int JULY = 6;
	static final int AUGUST = 7;
	static final int SEPTEMBER = 8;
	static final int OCTOBER = 9;
	static final int NOVEMBER = 10;
	static final int DECEMBER = 11;

	static final String[] monthName = { 
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
	};

	static final int DAYS_IN_JANUARY = 31;
	static final int DAYS_IN_FEBRUARY_NORMAL = 28;
	static final int DAYS_IN_FEBRUARY_LEAP = 29;
	static final int DAYS_IN_MARCH = 31;
	static final int DAYS_IN_APRIL = 30;
	static final int DAYS_IN_MAY = 31;
	static final int DAYS_IN_JUNE = 30;
	static final int DAYS_IN_JULY = 31;
	static final int DAYS_IN_AUGUST = 31;
	static final int DAYS_IN_SEPTEMBER = 30;
	static final int DAYS_IN_OCTOBER = 31;
	static final int DAYS_IN_NOVEMBER = 30;
	static final int DAYS_IN_DECEMBER = 31;

	static final int[] daysInMonth = {
			DAYS_IN_JANUARY,
			0,
			DAYS_IN_MARCH,
			DAYS_IN_APRIL,
			DAYS_IN_MAY,
			DAYS_IN_JUNE,
			DAYS_IN_JULY,
			DAYS_IN_AUGUST,
			DAYS_IN_SEPTEMBER,
			DAYS_IN_OCTOBER,
			DAYS_IN_NOVEMBER,
			DAYS_IN_DECEMBER
	};

	// Control

	public static void main(String[] args) {
		// Setup
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		if (year <= 0) {
			System.out.println("Invalid year!");
			System.exit(0);
		}

		System.out.print("Enter a day of the week: ");
		int dayOfWeek = scanner.nextInt();
		if (dayOfWeek < 0 || dayOfWeek > 6) {
			System.out.println("Invalid day-of-week!");
			System.exit(0);
		}

		if (isLeapYear(year))
			daysInMonth[FEBRUARY] = DAYS_IN_FEBRUARY_LEAP;
		else
			daysInMonth[FEBRUARY] = DAYS_IN_FEBRUARY_NORMAL;
			
		// Output
		for (int i = 0; i < MONTHS_PER_YEAR; i++) {
			printMonth(monthName[i], daysInMonth[i], dayOfWeek);
			dayOfWeek = (dayOfWeek + daysInMonth[i]) % 7;
		}
		
		// Cleanup
		scanner.close();
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void printMonth(String monthName, int daysInMonth, int startDayOfWeek) {
		System.out.println(monthName);

		for (int i = 0; i < startDayOfWeek; i++)
			System.out.print("   ");

		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf(" %2d", i);
			if ((i + startDayOfWeek) % 7 == 0)
				System.out.println();
		}
		System.out.println();

		System.out.println();
	}

}
