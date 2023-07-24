package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\io//b.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		Employee e=new Employee();
		e.name="rahul";
		e.maths=98;
		e.physics=58;
		e.chemistry=67;
		
		out.writeObject(e);
out.close();
file.close();
	
	}

}
