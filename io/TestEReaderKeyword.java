package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;

public class TestEReaderKeyword {
	public static void main(String[] args) throws Exception {
	
		
		InputStreamReader isReader= new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(isReader);
		
		PrintWriter out=new PrintWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\io\\cahul.txt"));
		String line=in.readLine();
		while(!line.equals("quit")){
			
		out.print(line);
		line=in.readLine();
		}
		isReader.close();
		out.close();
		in.close();
		
	}

}
