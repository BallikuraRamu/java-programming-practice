package io_streams.character_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\SHARPGURUS\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\output1.txt");
		try (BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\Users\\SHARPGURUS\\Downloads\\new.txt")) {
			bis.skip(10);
			int ch;
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
		}
	}
}
