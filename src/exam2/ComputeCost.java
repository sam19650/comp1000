package exam2;

public class ComputeCost {

    public static void main(String args[]) {
        System.out.printf("$%.2f%n", computeCost(0));
        System.out.printf("$%.2f%n", computeCost(4));
        System.out.printf("$%.2f%n", computeCost(5));
        System.out.printf("$%.2f%n", computeCost(6));
        System.out.printf("$%.2f%n", computeCost(10));
    }

    public static double computeCost(int numItems) {
    	double itemPrice;
    	
    	if (numItems > 5)
    		itemPrice = 9.5;
    	else
    		itemPrice = 10.0;
    	
    	double cost;
    	
    	cost = numItems * itemPrice;
    	
    	return cost;
    }
    
}
