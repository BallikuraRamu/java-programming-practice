package io_streams.byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AppendByteStrams {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\\\Users\\\\SHARPGURUS\\\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\\\Documents\\\\PST git\\\\crewpro-assignedjob-create-rest-services-v2_0\\\\crewpro-assignedjob-create-rest-services-v2_0-war\\\\src\\\\main\\\\java\\\\com\\\\pst\\\\app\\\\crewpro\\\\assignedjob\\\\services\\\\war\\\\main\\\\Application.java");
			fos = new FileOutputStream("C:\\Users\\SHARPGURUS\\Downloads\\output1.txt", true); // append mode...

			int ch;
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			System.out.println("Content appended.....");
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
}
