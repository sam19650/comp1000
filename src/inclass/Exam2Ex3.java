package inclass;

public class Exam2Ex3 {

	static final double G = 6.673E-11; // 6.673 * Math.pow(10, -11)

	public static void main(String[] args) {
		// Input
		double mass1 = 10000; // Kg
		double mass2 = 10000; // Kg
		double distance = 1; // m
		
		// Process
		double force = gravitationalForce(mass1, mass2, distance);

		// Output
		System.out.printf("Given m1=%.3fkg, m2=%.3fkg, d=%.3fm, then F=%.3fN%n",
				mass1, mass2, distance, force);
	}

	public static double gravitationalForce(double m1, double m2, double d) {
		return (G * m1 * m2) / (d * d);
	}

}
