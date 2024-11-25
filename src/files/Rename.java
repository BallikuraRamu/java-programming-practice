package files;

import java.io.File;
import java.io.IOException;

public class Rename {
	public static void main(String[] argv) throws IOException {
		File f = new File("F:/in.txt");
		f.renameTo(new File("out.java"));
	}
}
