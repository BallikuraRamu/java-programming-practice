package io_streams.character_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	public static void main(String[] args) throws IOException {
		FileReader fis = null;
		FileWriter fos = null;
		try {
			fis = new FileReader("C:\\Users\\SHARPGURUS\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\Documents\\PST git\\crewpro-assignedjob-create-rest-services-v2_0\\crewpro-assignedjob-create-rest-services-v2_0-war\\src\\main\\java\\com\\pst\\app\\crewpro\\assignedjob\\services\\war\\main\\Application.java");
			   fos = new FileWriter("C:\\Users\\SHARPGURUS\\Downloads\\output1.txt"); 
			int ch;
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			System.out.println("copied....");
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
