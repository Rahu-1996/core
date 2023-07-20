package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yy");
		String str="04/07/1998";
		Person a= new Person();
		
		a.setName("rahul");
		a.setName("address");
		a.setAddr("camp");
		a.setDob(sdf.parse(str));
		
		
		  System.out.println(a.getName());
	    System.out.println(sdf.format(a.getDob()));
	    System.out.println(a.getAddr());
	    
		
	}

}
