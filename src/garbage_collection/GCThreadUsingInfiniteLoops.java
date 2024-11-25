package garbage_collection;

public class GCThreadUsingInfiniteLoops extends Thread {
	int obj_no;

	GCThreadUsingInfiniteLoops() {
		// empty...
	}

	GCThreadUsingInfiniteLoops(int obj_no) {
		this.obj_no = obj_no;
		System.out.println("Created : " + this.obj_no);
	}

	public static void main(String[] args) throws Exception {
		GCThreadUsingInfiniteLoops thread = new GCThreadUsingInfiniteLoops();
		thread.start();

		for (int i = 1; i <= 10; i++) {
			new GCThreadUsingInfiniteLoops(i);
			Thread.sleep(100);
		}

		thread.stop();
	}

	protected void finalize() {

		System.out.println("Deleted : " + this.obj_no);
	}

	public void run() {
		while (true) {
			System.gc(); // infinite loop.....
		}
	}
}
