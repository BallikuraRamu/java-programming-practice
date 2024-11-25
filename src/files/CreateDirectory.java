package files;

import java.io.File;

public class CreateDirectory {
	public static void main(String list[]) {
		String s1 = "C:\\Users\\SHARPGURUS\\Downloads\\output1";
		String s2 = "C:\\Users\\SHARPGURUS\\Downloads\\new";
		File f1 = new File(s1);
		File f2 = new File(s2);
		if (f1.mkdir()) {
			System.out.println(f1 + "Created");
		}
		if (f2.mkdirs()) {
			System.out.println(f2 + "Created");
		}

		if (list.length == 0) {
			System.out.println("no input......");
		} else {
			for (int i = 0; i < list.length; i++) {
				CreateDirectory.fileRemove(list[i]);
			}
		}

	}

	static void fileRemove(String name) {
		File target = new File(name);
		if (target.exists()) {
			if (target.delete())
				System.out.println(name + " deleted...");
			else
				System.out.println("failed in deletion of " + name);
		} else {
			System.out.println(name + " not present");
		}
	}
}
