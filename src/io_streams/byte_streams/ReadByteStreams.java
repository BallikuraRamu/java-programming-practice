package io_streams.byte_streams;

import java.io.*;

class ReadByteStreams {
	public static void main(String[] args) throws Exception {
		FileInputStream files = null;

		try {
//			files = new FileInputStream("C:\\Users\\SHARPGURUS\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\Documents\\PST git\\crewpro-assignedjob-create-rest-services-v2_0\\crewpro-assignedjob-create-rest-services-v2_0-war\\src\\main\\java\\com\\pst\\app\\crewpro\\assignedjob\\services\\war\\main\\Application.java");
			files = new FileInputStream("C:\\Users\\SHARPGURUS\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\Documents\\CPC-117683.docx");

			System.out.println("File opened....");

			int ch;
			while ((ch = files.read()) != -1) {
				System.out.print((char) ch);
			}
		} finally {
			if (files != null) {
				files.close();
				System.out.println("File closed...");
			}
		}
	}
}
