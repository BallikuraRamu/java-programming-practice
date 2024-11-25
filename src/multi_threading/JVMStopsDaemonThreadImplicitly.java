package multi_threading;

public class JVMStopsDaemonThreadImplicitly {
	public static void main(String[] args) {
		Demo child = new Demo();
		child.setDaemon(true);
		child.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Non-Daemon : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		System.out.println("Non-Daemon exiting...");
	}
}

class Demo extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Daemon : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println("Daemon exiting...");
	}
}
