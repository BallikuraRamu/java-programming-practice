package scanner_random;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Above why we mention System class in constructor because input source type is Keyboard
		int num = scanner.nextInt();
		System.out.println(num);
		
		String str = scanner.nextLine();
		System.out.println(str);
	}
}
