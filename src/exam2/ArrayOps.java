package exam2;

import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		
		int[] values;
		values = new int[400];

		for (int i = 0; i < values.length; i++)
			values[i] = i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter an integer between %d and %d: ", 0, values.length);
		int value = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] % value == 0)
				values[i] *= 2;
		}
		
	}
}
