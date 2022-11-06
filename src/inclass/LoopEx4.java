package inclass;

public class LoopEx4 {

	public static void main(String[] args) {
	
		long start = System.currentTimeMillis();
		
		long i = 0;
		while (i < Long.MAX_VALUE) {
			i++;
		}

		long end = System.currentTimeMillis();

		long elapsed = end - start;
		
		System.out.printf("Elapsed = %d msec\n", elapsed);
	}

}
