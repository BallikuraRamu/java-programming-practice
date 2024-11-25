package io_streams.byte_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OpenImage {
public static void main(String[] args) throws IOException {
	FileInputStream image = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("select your image : ");
	String inputImg = scanner.nextLine();
	
	image = new FileInputStream(inputImg);
	System.out.println("Image opened ------------------");
	image.close();
}
}
