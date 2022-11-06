package assignment;

import java.util.Scanner;

public class PA6 {

	// Data

	static final int january = 0;
	static final int february = 1;
	static final int march = 2;
	static final int april = 3;
	static final int may = 4;
	static final int june = 5;
	static final int july = 6;
	static final int august = 7;
	static final int september = 8;
	static final int october = 9;
	static final int november = 10;
	static final int december = 11;

	static final int januaryDay = 31;
	static final int februaryDay = 28;
	static final int marchDay = 31;
	static final int aprilDay = 30;
	static final int mayDay = 31;
	static final int juneDay = 30;
	static final int julyDay = 31;
	static final int augustDay = 31;
	static final int septemberDay = 30;
	static final int octoberDay = 31;
	static final int novemberDay = 30;
	static final int decemberDay = 31;

	static final String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	static final int[] daysPerMonth = { januaryDay, februaryDay, marchDay, aprilDay, mayDay, juneDay, julyDay,
			augustDay, septemberDay, octoberDay, novemberDay, decemberDay };

	// Code

	public static void main(String[] args) {

		// Setup
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.print("Enter the year for the calendar: ");
		int year = scanner.nextInt();
		System.out.print("Enter the start day of the week for January 1st, between 0-6: ");
		int startDay = scanner.nextInt();

		if (year < 0) {
			System.out.println("Please enter a positive number for the year.");
			System.exit(0);
		}
		if (startDay < 0 || startDay > 6) {
			System.out.println("Please enter a valid day between 0 and 6.");
			System.exit(0);
		}

		if (isLeapYear(year)) {
			daysPerMonth[february] = 29;
		} else {
			daysPerMonth[february] = 28;
		}

		// Output
		for (int i = 0; i < 12; i++) {
			printMonthDayCalendar(monthName[i], startDay, daysPerMonth[i]);
			startDay = (startDay + daysPerMonth[i]) % 7;
		}

		// Cleanup
		scanner.close();
	}

	public static void printMonthDayCalendar(String monthName, int startDayOfWeek, int numberOfDays) {
		System.out.println(monthName);

		for (int i = 0; i < startDayOfWeek; i++)
			System.out.print("   ");

		for (int i = 1; i <= numberOfDays; i = i + 1) {
			System.out.printf(" %2d", i);
			if ((i + startDayOfWeek) % 7 == 0)
				System.out.println();
		}
		System.out.println();

		System.out.println();
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		return year % 400 == 0;
	}

}
