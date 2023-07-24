package com.rays.io;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TestRead {
	public static void main(String[] args)throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\io//b.txt");
		ObjectInputStream in=new ObjectInputStream(file);
		
		Employee e =(Employee) in.readObject();
		
		System.out.println(e.chemistry);
	System.out.println(e.name);
	System.out.println(e.maths);
	System.out.println(e.physics);
		
		in.close();
		file.close();
		
	}

}
