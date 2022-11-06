package inclass;

import java.util.Random;

public class Exercise01 {

	public static void main(String[] args) {

		Random random = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < 10; i++) {
			int value;
			
			value = random.nextInt(100);
			
			System.out.println(value);
		}

	}

}
