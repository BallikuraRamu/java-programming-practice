package multi_threading;

public class CreationOfUsingThreadRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		CreationOfUsingThreadRunnable cr = new CreationOfUsingThreadRunnable();
		Thread thread = new Thread(cr);
		thread.start();
		
	}
	

}
