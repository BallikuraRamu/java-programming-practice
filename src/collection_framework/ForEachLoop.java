package collection_framework;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int i = 0;
		for (int j : arr) {
			arr[i] = j + 100;
			i++;
		}
		System.out.println("Array elements are : ");
		for (int ele : arr) {
			System.out.println(ele);
		}
	}
}
