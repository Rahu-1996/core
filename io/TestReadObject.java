package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestReadObject {
	
	public static void main(String[] args) throws Exception {
		
	

       FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\io//b.txt");
        ObjectInputStream in=new ObjectInputStream(file);

   
	Marksheet m=(Marksheet)in.readObject();
	
	System.out.println(m.name);
	System.out.println(m.Maths);
	System.out.println(m.Physics);
	System.out.println(m.Chemishtry);
	
	
	file.close();
	in.close();
}
}