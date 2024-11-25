package polymorphism;

public class Compiletime {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.sum(10, 20, 30);
	}
}

class Addition {
	void sum(int a, int b) {
		System.out.println((a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println((a + b + c));
	}
}