package exam3;

public class AverageUtil {

	public static double getAverage(int[] values) {

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		double average;
		if (values.length == 0)
			average = 0.0;
		else
			average = sum / values.length;
		
		return average;
	}

	public static void main(String[] args) {
		int[] values1 = {1, 2, 3};
		System.out.println(getAverage(values1));

		int[] values2 = {10, 5};
		System.out.println(getAverage(values2));	
	}

}
