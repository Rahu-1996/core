package com.rays.constructorcalling;

public class Employee extends Person{
	

	private String engineer=null;
	
	public Employee() {
		
		System.out.println("Default Constructor");
	}
	public Employee(String firstName,String lastName, String Address,String engineer) {
		super();
		engineer=engineer;
		System.out.println("sout");
	}
	public void setEngineer() {
		this.engineer=engineer;
	}
	public String getEngineer() {
		return engineer;
	}

}
