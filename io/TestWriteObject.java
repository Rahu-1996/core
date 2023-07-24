package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWriteObject {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\io//b.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		Marksheet m=new Marksheet();
		m.name="shyam";
		m.Maths=66;
		m.Physics=67;
		m.Chemishtry=98;
	    

		out.writeObject(m);
		file.close();
		out.close();
	}

}
