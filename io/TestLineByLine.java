package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestLineByLine {


	public static void main(String[] args) throws IOException {
		
		FileWriter out=new FileWriter("C:\\Users\\Administrator\\Desktop\\io\\java.txt");
		
		PrintWriter pw=new PrintWriter(out);
		
		for(int i=0;i<5;i++){
		
	
		
		pw.println(i+"Hello");
		
	
		}
		out.close();
		pw.close();
	}

}
