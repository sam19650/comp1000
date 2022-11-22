package exam2;

public class FindMedian {

    public static void main(String[] args) {
        double result = median(9.5, 4.0, 7.2);
        System.out.printf("The median of 9.5, 4.0, and 7.2 ");
        System.out.printf("is %.3f%n", result);
    }

	private static double median(double x0, double x1, double x2) {
		double minimum, maximum;
		
		if (x0 > x1) {
			minimum = x1;
			maximum = x0;
		} else {
			minimum = x0;
			maximum = x1;
		}

		if (x2 > maximum) {
			x0 = minimum;
			x1 = maximum;
		} else if (x2 < minimum) {
			x0 = x2;
			x1 = minimum;
			x2 = maximum;
		} else {
			x0 = minimum;
			x1 = x2;
			x2 = maximum;
		}
		
		return x1;
	}

}
