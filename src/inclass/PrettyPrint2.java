package inclass;

public class PrettyPrint2 {

	public static void main(String[] args) {

		// Output
		String formatString = "%-10s %-20s %5s %5s\n";
		System.out.println("-------------------------------------------------------");
		System.out.printf(formatString, "ID", "NAME", "AGE", "GRADE");
		System.out.println("-------------------------------------------------------");
		System.out.format(formatString, "W101", "John", 8, '4');
		System.out.format(formatString, "W102", "Leo", 10, '6');
		System.out.format(formatString, "W103", "Mary", 5, '2');
		System.out.format(formatString, "W104", "Lisa", 6, '3');
		System.out.println("-------------------------------------------------------");	
	}

}
