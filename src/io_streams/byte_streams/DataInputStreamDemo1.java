package io_streams.byte_streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo1 {
	public static void main(String[] args) {
		int eno = 1001;
		String ename = "srinivas";
		try {
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\SHARPGURUS\\\\Downloads\\\\new.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(eno);
			dos.writeUTF(ename);
			dos.close();
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\SHARPGURUS\\\\Downloads\\\\new.txt");
			DataInputStream dis = new DataInputStream(fis);
			int id = dis.readInt();
			System.out.println("Id: " + id);
			String name = dis.readUTF();
			System.out.println("Name: " + name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
