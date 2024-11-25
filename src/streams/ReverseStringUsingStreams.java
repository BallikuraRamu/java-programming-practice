package streams;

public class ReverseStringUsingStreams {
	public static void main(String[] args) {

		String name = "Ramu";
		String sb = new StringBuilder(name).reverse().toString();
		System.out.println("Using StringBuilder : " + sb);

		String reversed = name.chars().mapToObj(c -> (char) c).reduce("", (c, s) -> s + c, String::concat);
		System.out.println("Using IntStream : " + reversed);
		;
	}
}
