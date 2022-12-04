package exam3;

public class Point {

	// Attributes
	
	private double x;

	private double y;
	
	
	// Methods
	
	public Point(double x) {
		this.x = x;
		y = 0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(Point point) {
		return Math.sqrt(
				Math.pow(x - point.x, 2) + 
				Math.pow(y - point.y, 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("My Class Point [x = %.2f, y = %.2f]", x, y); 
	}
	
	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		System.out.println(point1);
		
		Point point2 = new Point(2);
		System.out.println(point2);

		double distance1 = point1.getDistance(point2);
		System.out.printf("Distance is %.2f%n", distance1);

		double distance2 = point2.getDistance(point1);
		System.out.printf("Distance is %.2f%n", distance2);

	}

}
