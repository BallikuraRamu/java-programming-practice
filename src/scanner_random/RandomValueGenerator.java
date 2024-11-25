package scanner_random;

import java.util.Random;

public class RandomValueGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		int r = 0;
		// Generate 20 random integers.
		for (int i = 0; i < 20; i++) {
			r = random.nextInt(1000);
			r++;
			System.out.println(r);
		}
		short s = (short) random.nextInt(10); // type conversation and generates MIN to MAX specified in arguments
	System.out.println(s);
	}
}
