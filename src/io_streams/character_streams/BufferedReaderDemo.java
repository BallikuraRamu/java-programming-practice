package io_streams.character_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\SHARPGURUS\\Downloads\\output1.txt");
			BufferedReader br = new BufferedReader(f);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
		}
	}
}
