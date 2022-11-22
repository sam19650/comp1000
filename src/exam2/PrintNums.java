package exam2;

public class PrintNums {

    public static void main(String args[]) {
        printNums(3, 5);
        printNums(3, 3);
        printNums(5, 3);
    }

    public static void printNums(int start, int end) {
    	if (start > end) {
    		System.out.println("error");
    		System.exit(0);
    	}

    	for (int i = start; i <= end; i++)
    		System.out.println(i);
    }
    
}
