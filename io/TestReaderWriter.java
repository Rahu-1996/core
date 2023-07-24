package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestReaderWriter {
	public static void main(String[] args) throws IOException {
		String source=("C:\\Users\\Administrator\\Desktop\\io\\java.txt"); 
		String target=("C:\\Users\\Administrator\\Desktop\\io\\c.txt");
	
		FileInputStream in= new FileInputStream(source);
		
		FileOutputStream out= new FileOutputStream(target);
		
		int ch=in.read();
		while(ch!=-1) {
			System.out.print(" "+ch);
			out.write(ch);
			ch=in.read();
			
		}
		in.close();
		out.close();
		System.out.println(source+" source "+target);

	}

}
