package inner_classes;

public class Outer {

	static void m1() {
		System.out.println("Outer Class static method . . . ");
	}
	public static void main(String[] args) {
		Outer.m1();
		Outer.Inner.m2();
	}
	public static class Inner{
		static void m2() {
			System.out.println("Inner class static method .... ");
		}
	}

}
