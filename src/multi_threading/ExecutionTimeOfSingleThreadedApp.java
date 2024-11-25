package multi_threading;

public class ExecutionTimeOfSingleThreadedApp {
	public static void main(String[] args) throws InterruptedException {
		TimeCalculate ex = new TimeCalculate();
		System.out.println(System.currentTimeMillis());
		ex.print1to50();
		ex.print50to1();
		System.out.println(System.currentTimeMillis());
	}
	
}
class TimeCalculate{
	void print1to50() throws InterruptedException {
		for(int i =0; i<=50; i++) {
			System.out.print(i);
			Thread.sleep(100);
		}
	}
	void print50to1() throws InterruptedException {
		for(int j =50; j>=1l;j--) {
			System.out.print(j);
			Thread.sleep(100);
		}
		
	}
}
