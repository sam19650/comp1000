package exam3;

public class Fragment {

	public static void main(String[] args) {

		// Fragment 1
					//  0   1  2  3   4  5  6  7
		int[] array = { 5, -1, 0, 9, -2, 8, 7, 4 };
		int sum = 0;
		for (int i = 6; i >=0 ; i = i - 2) {
		   sum = sum + array[i];
		}
		System.out.printf("Sum = %d%n", sum);


		// Fragment 2
		double value;
		value = 24 / 20;
		System.out.printf("%.2f", value);


		// Fragment 3
		double x = 1.5;
		double y = 3.0;
		double z = 4.5;
		z = average(x, y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.2f%n", z);
	}

	private static double average(double a, double b) {
		return (a + b) / 2;
	}

}
