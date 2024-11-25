package wrapper;

public class StringToPrimitive {
	public static void main(String[] args) {
		String name = "150";
		byte b = Byte.parseByte(name);
		System.out.println(b);

		int i = Integer.parseInt(name);
//		System.out.println(i);
		
		
	}
}
