package io_streams.byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteByteStreams {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the path of the input file: ");
		String inputFilePath = scanner.nextLine();

		System.out.println("Enter the path of the output file: ");
		String outputFilePath = scanner.nextLine();

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(inputFilePath);
			fos = new FileOutputStream(outputFilePath);

			int ch;
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			System.out.println("File copied....");
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
			scanner.close();
		}
	}
}
