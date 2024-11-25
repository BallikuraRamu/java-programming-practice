package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Users\\SHARPGURUS\\Downloads\\output1.txt");
		File outputFile = new File("C:\\Users\\SHARPGURUS\\Downloads\\new.txt");
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		while ((c = in.read()) != -1)
			out.write(c);
		in.close();
		out.close();
	}
}
