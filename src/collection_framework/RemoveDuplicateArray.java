package collection_framework;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		String[] array = { "Apple", "Banana", "Cherry", "Banana", "Date", "Apple" };
		System.out.println("Original array: " + Arrays.toString(array));
		printDuplicates(array);
		removeDuplicate(array);

	}

	public static void printDuplicates(String[] arr) {

		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();

		for (String element : arr) {
			if (hs1.contains(element)) {
				hs2.add(element);
			} else {
				hs1.add(element);
			}
		}
		if (hs2.isEmpty()) {
			System.out.println("No duplicates found ");
		} else {
			System.out.println("Found duplicate : " + hs2);
		}
	}

	public static void removeDuplicate(String[] str) {
		HashSet<String> hashSet = new HashSet<>();
		String duplicate = null;
		for (String st : str) {
			if (hashSet.contains(st)) {
				duplicate = st;
				break;
			} else {
				hashSet.add(st);
			}
		}
		System.out.println("Duplicate : " + duplicate);

	}
}
