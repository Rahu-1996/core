package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestPerson  {
	public static void main(String[] args) {
		
	     Person p1=new Person(1,"ram");
	     Person p2=new Person(2,"shyam");
	     Person p3=new Person(3,"laxman");
	     Person p4=new Person(4,"disha");
	     
	     Collection c=new ArrayList();
	     
	     c.add(p1);
	     c.add(p2);
	     c.add(p3);
	     c.add(p4);
	     
	     System.out.println(c);
	}

}
