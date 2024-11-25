package garbage_collection;

class Memory {
	public static void main(String[] args) {
		long mm, tm, fm;
		Runtime r = Runtime.getRuntime();

		mm = r.maxMemory();
		tm = r.totalMemory();
		fm = r.freeMemory();
		System.out.println("JVM size : " + mm / (1024 * 1024));
		System.out.println("Heap size : " + tm / (1024 * 1024));
		System.out.println("free Heap size : " + fm / (1024 * 1024));
	}
}
