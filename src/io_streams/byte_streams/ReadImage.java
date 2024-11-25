package io_streams.byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadImage {
	public static void main(String[] args) throws Exception 
	 { 
	  FileInputStream fis = null ; 
	  FileOutputStream fos = null ; 
	  try 
	  { 
	   fis = new FileInputStream("C:\\Users\\SHARPGURUS\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\Pictures\\Screenshots\\chat gpt.jpg"); 
	   fos = new FileOutputStream("C:\\Users\\SHARPGURUS\\OneDrive - SAICON TECHNOLOGIES INDIA PVT LTD\\Documents\\output image.jpg"); 
	 	 
	   int ch ; 
	   while((ch=fis.read()) != -1) 
	   { 
	    fos.write(ch); 
	   } 
	   System.out.println("Image copied successfully..."); 
	  } 
	  finally 
	  { 
	   if(fis != null) 
	   { 
	    fis.close(); 
	   } 
	   if(fos != null) 
	   { 
	    fos.close(); 
	   } 
	  } 
	 }
}
