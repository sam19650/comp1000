package assignment;


public class HelloWorld {

	// Data
	
	String greetingText = "Hello, World.";
	
	// Code

	public void greetWorld() {
		System.out.println(greetingText);		
	}
	
	public static void main(String[] args) {
		HelloWorld x = new HelloWorld();
		
		x.greetWorld();
	}

}
