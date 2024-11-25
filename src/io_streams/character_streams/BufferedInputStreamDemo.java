package io_streams.character_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream(
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\SHARPGURUS\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\output1.txt");
		BufferedInputStream bis = new BufferedInputStream(fr);
		FileOutputStream bos = new FileOutputStream("C:\\Users\\SHARPGURUS\\Downloads\\new.txt");
		try {
			int ch;
			while ((ch = bis.read()) != -1) {
				bos.write(ch);
			}
		} finally {
			fr.close();
			bis.close();
			bos.close();
		}
	}
}
