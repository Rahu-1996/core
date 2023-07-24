package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException  {
		
		FileWriter out=new FileWriter("C:\\Users\\Administrator\\Desktop\\io//b.txt",true);
		
		out.write('a');
		out.write('\n');
		out.write("hfiuuuopipkkl"+'\n');
		
		out.write("This is line one"+'\n');
		out.write("This is line two"+'\n');
		out.close();
		System.out.println("Check C:\\Users\\Administrator\\Desktop\\io//b.txt");
	}

}
