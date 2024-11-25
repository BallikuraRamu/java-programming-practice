package wrapper;

public class ObjectToString {
	public static void main(String[] args) {
		byte a =10;
		Byte b = Byte.valueOf(a); // Boxing conversation is done --> Primitive to Object 
		String s = b.toString();  // Object to String
		System.out.println(s);
	}
}
