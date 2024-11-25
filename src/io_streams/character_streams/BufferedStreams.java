package io_streams.character_streams;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class BufferedStreams {
	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("C:\\\\Users\\\\SHARPGURUS\\\\Downloads\\\\output1.txt");
			fw = new FileWriter("C:\\Users\\SHARPGURUS\\Downloads\\new.txt");
			bw = new BufferedWriter(fw);

			int ch;
			while ((ch = fr.read()) != -1) {
				bw.write(ch);
			}
		} finally {
			if (bw != null) {
				bw.close();
			}
			if (fr != null) {
				fr.close();
			}
			if (fw != null) {
				fw.close();
			}

		}
	}
}
