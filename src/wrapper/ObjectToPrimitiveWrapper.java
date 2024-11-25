package wrapper;

public class ObjectToPrimitiveWrapper {
	
	public static void main(String[] args) {
		byte x = 100;
		Byte y = Byte.valueOf(x); // Boxing
		byte z = y.byteValue();   // Un-Boxing
		
		System.out.println(z);
	}
}
