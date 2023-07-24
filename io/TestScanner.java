package com.rays.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner {


	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\Users\\Administrator\\Desktop\\io\\java.txt");
		Scanner sc=new Scanner(reader);
		while(sc.hasNext()) {
			
			System.out.println(sc.nextLine());
			
		}
		reader.close();
		sc.close();
   
	}

}
