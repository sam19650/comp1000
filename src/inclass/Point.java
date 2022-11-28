package inclass;

public class Point {

	// Data, Attributes, Properties
	
	private double x;

	private double y;
	
	
	// Code, Methods, Operations, Behavior
	
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

}
