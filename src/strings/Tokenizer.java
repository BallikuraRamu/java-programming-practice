package strings;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		String line = "this is a test";
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
