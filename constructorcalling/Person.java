package com.rays.constructorcalling;

public class Person {
	
	private String firstName;
    private String lastName;
    private String Address;
    
    public Person () {
    	System.out.println("Person Default");
    	
    }
    
    public Person(String firstName,String lastName,String Address) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.Address=Address;
    	
    	
    }
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public String getFirstName() {
		return firstName;
	}
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
     public String getLastName() {
		return lastName;
	}
}
