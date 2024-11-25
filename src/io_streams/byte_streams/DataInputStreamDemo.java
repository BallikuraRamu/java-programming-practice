package io_streams.byte_streams;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\SHARPGURUS\\Downloads\\new.txt");
		DataInputStream dis = new DataInputStream(fis);
		while (dis.available() != 0) {
			System.out.println(dis.readLine());
		}
		dis.close();
	}
}
