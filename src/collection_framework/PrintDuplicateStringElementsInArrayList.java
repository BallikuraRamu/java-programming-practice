package collection_framework;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateStringElementsInArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Banana");
		list.add("Date");
		list.add("Apple");
		list.add("Cherry");

		HashSet<String> seenElements = new HashSet<>();

		String firstDuplicate = null;
		for (String element : list) {
			if (seenElements.contains(element)) {
				firstDuplicate = element;
				break;
			} else {
				seenElements.add(element);
			}
		}

		String secondDuplicate = null;
		int duplicate = 0;
		for (String element : list) {
			if (seenElements.contains(element)) {
				duplicate++;
				if (duplicate == 2) {
					secondDuplicate = element;
					break;
				}
			} else {
				seenElements.add(element);
			}
		}
		System.out.println("The firstDuplicate element is: " + firstDuplicate);
		if (secondDuplicate != null) {
            System.out.println("The second duplicate element is: " + secondDuplicate);
        } else {
            System.out.println("No second duplicate element found");
        }

	}
}
