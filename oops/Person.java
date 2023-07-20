package com.rays.oops;

import java.util.Date;

public class Person {
	
	private String name=null;
	private Date dob =new Date();
	private String addr=null;
	public static final int Avg_age =26;
	
	
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
		
		
	}
	
public void setDob(Date dob) {
		
		this.dob=dob;
		
	}
	
	public Date getDob() {
		return dob;
		
	}
	
   public String getAddr() {
	return addr;
	   
	   
   }
   
   public void setAddr(String addr) {}
   
   
}
