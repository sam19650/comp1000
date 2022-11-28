package inclass;

public class Main {

	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		Point point2 = new Point(4, 5);

		System.out.printf("Point 1: X = %.2f, Y = %.2f%n", point1.getX(), point1.getY());
		System.out.printf("Point 2: X = %.2f, Y = %.2f%n", point2.getX(), point2.getY());

		double distance1 = point1.getDistance(point2);
		System.out.printf("Distance is %.2f%n", distance1);

		double distance2 = point2.getDistance(point1);
		System.out.printf("Distance is %.2f%n", distance2);
	}

}
