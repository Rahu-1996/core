package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestMail {
public static void main(String[] args) throws Exception {
		
		FileReader in=new FileReader ("C:\\Users\\Administrator\\Desktop\\io\\email.txt");
		
		BufferedReader file=new BufferedReader(in);
		
		PrintWriter out=new PrintWriter("C:\\Users\\Administrator\\Desktop\\io\\gmail.txt");
		
		String line=file.readLine();
		
		String emailreg="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		while(line !=null){
			
			if(line.matches(emailreg)){
				
				out.println(line);
				
			}else {
				System.out.println("invalid:"+line);
			}
			line=file.readLine();	
		}
		out.close();
		file.close();
		in.close();
		
	}

}
