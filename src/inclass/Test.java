package inclass;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100));
		}
		long start = System.currentTimeMillis();
		for (long i = 0; i < Long.MAX_VALUE; i++);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
