package multi_threading;

public class MultiThread extends Thread {
	public static void main(String[] args) {
		MultiThread multiThread = new MultiThread();
		multiThread.start();
		for(int j=0;j<=10;j++) {
			System.out.println(Thread.currentThread().getName());

//			System.out.println(j);
		}
	}

	public void run() {
		for (int i = 0; i <= 200; i++) {
//			System.out.println(i);
		}
	}
}
