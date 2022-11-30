package inclass;

public class Point {

	// Attributes
	
	private double x;

	private double y;
	
	
	// Methods
	
	public Point(double x) {
		this.x = x;
		this.y = 0;
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
		return String.format("Point [x = %.2f, y = %.2f]", x, y); 
	}
	
}
