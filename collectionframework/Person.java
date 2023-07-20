package com.rays.collectionframework;

public class Person {

	private int id=0;
	private String name=null;
	

	
	public Person(int id, String name) {
	 this.id=id;
	 this.name=name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName(String string) {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return id +" "+name;
    }
	}


