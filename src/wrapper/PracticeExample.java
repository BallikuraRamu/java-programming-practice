package wrapper;

public class PracticeExample {
public static void main(String[] args) {
	byte a = 100;
	String b = Byte.toString(a);
	Byte c = Byte.valueOf(b);
	byte d = c.byteValue();
	Byte e = Byte.valueOf(d);
	String f = Byte.toString(e);
	byte g = Byte.parseByte(f);
	
	System.out.println(g);
	
}
}
