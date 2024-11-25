package io_streams.byte_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
	public static void main(String args[]) throws IOException {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream bais1 = new ByteArrayInputStream(b);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(b, 3, 3);

		ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
		ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
		int ch;
		while ((ch = bais1.read()) != -1) {
			baos1.write(ch);
		}
		while ((ch = bais2.read()) != -1) {
			baos2.write(ch);
		}
		byte b1[] = baos1.toByteArray();
		byte b2[] = baos2.toByteArray();

		System.out.println("b1 array contents");
		for (int i = 0; i < b1.length; i++) {
			System.out.print((char) b1[i]);
		}
		System.out.print(" b2 arrray contents :");
		for (int i = 0; i < b2.length; i++) {
			System.out.print((char) b2[i]);
		}
	}
}
