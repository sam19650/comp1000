package inclass;

public class Main {

	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		System.out.println(point1);
		
		Point point2 = new Point(2);
		System.out.println(point2);

		double distance1 = point1.getDistance(point2);
		System.out.printf("Distance is %.2f%n", distance1);

		double distance2 = point2.getDistance(point1);
		System.out.printf("Distance is %.2f%n", distance2);

	
		Circle circle = new Circle(point1, 5);
	
	}

}
