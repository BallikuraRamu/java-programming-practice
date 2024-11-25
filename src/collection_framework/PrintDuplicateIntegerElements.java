package collection_framework;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateIntegerElements {
	public static void main(String[] args) {
		ArrayList<Integer> aLI = new ArrayList<>();
		aLI.add(10);
		aLI.add(20);
		aLI.add(30);
		aLI.add(10);
		aLI.add(20);
		aLI.add(30);

		HashSet<Integer> hs = new HashSet<>();

		int firstDuplicate = 0;
		for (Integer el : aLI) {
			if (hs.contains(el)) {
				firstDuplicate = el;
				break;
			} else {
				hs.add(el);
			}
		}

		int secondDuplicate = 0;
		int dupCount = 0;
		for (Integer ele : aLI) {
			if (hs.contains(ele)) {
				dupCount++;
				if (dupCount == 2) {
					secondDuplicate = ele;
					break;
				} else {
					hs.add(ele);
				}
			}
		}

		System.out.println(aLI + " In the arraylist : duplicate first element is : " + firstDuplicate);
		System.out.println(aLI + " In the arraylist : duplicate second element is : " + secondDuplicate);

	}
}
