package wrapper;

public class PrimitiveToObjectWrapper {

	
	public static void main(String[] args) {
		byte x = 100;
		Byte y = Byte.valueOf(x); // Boxing conversation
		System.out.println(x + " " + y);
		
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println(b);
	}
}
