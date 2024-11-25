package garbage_collection;

public class GCDemo {
	GCDemo() {
		System.out.println(this + " has been created...");
	}

	protected void finalize() {
		System.out.println(this + " has been deleted...");
	}

	public static void main(String[] args) {
		new GCDemo();
		new GCDemo();// un referenced objects, eligible for GC
		for(int i=1 ; i<=100 ; i++) 
		  { 
		   System.gc(); 
		  } 
	}
}
