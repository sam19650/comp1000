package inclass;

import java.util.Random;

public class LoopEx3 {

	public static void main(String[] args) {

		int seed = 456;
		Random random = new Random(seed);
		
		for (int i = 0; i < 10; i++) {
			int value = random.nextInt(100);
			System.out.println(value);
		}

	}

}
