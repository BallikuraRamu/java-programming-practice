package multi_threading;

import java.util.Scanner;

public class JoinThreadDemo extends Thread {
	static int n, m = 0;

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		JoinThreadDemo.n = scanner.nextInt();
		
		JoinThreadDemo demo = new JoinThreadDemo();
		demo.start();
		demo.join();
		System.out.println("Sum of numbers :" + JoinThreadDemo.n + "Sum of all :" + JoinThreadDemo.m);
	}

	public void calculate() {
		for (int i = 0; i < JoinThreadDemo.n; i++) {
			JoinThreadDemo.m = JoinThreadDemo.m + i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println(JoinThreadDemo.m);
		}
	}

}
