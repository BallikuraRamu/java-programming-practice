package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
	static int count = 0;

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:\\\\\\\\Users\\\\\\\\SHARPGURUS\\\\\\\\Downloads\\\\\\\\output1.txt");
			br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line);
				while (str.hasMoreTokens()) {
					System.out.println(str.nextToken());
					count++;
				}
			}
			System.out.println("Word Count : " + count);

		} finally {
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();
			}
		}
	}
}
