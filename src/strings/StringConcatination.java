package strings;

public class StringConcatination {
	public static void main(String[] args) {
		String s1 = "Ra";
		String s2 = "m";

		// Using assignment operator
		String s3 = s1 + s2;
		System.out.println("Using assignment operator: " + s3);

		// using string inbuilt concate() method
		s2 = s1.concat(s2);
		System.out.println("Using concat() function : " + s2);
	}
}
