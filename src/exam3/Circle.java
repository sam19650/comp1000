package exam3;

public class Circle {

	// Attributes
	Point center;
	double radius;
	
	// Methods
	Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return String.format("Circle [radius = %.2f, center = %s]", radius, center); 
	}

	public static void main(String[] args) {
		Point center = new Point(2, 3);
		
		Circle circle = new Circle(center, 4);
		
		System.out.println(circle);
	}

}
