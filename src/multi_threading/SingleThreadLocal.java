package multi_threading;

public class SingleThreadLocal {

	void printNumbers() {
		for(int i =0; i<=200 ; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SingleThreadLocal stl= new SingleThreadLocal();
		stl.printNumbers();
		for(int j=0;j<=200;j++) {
			System.out.println(j);
		}
	}
}
