package com.rays.compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id=0;
	private String name=null;
	private String address=null;
	
	public Employee(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		
		return id+","+name+","+address;
	}
	@Override
	public int compareTo(Employee o) {
	int i=this.id-o.id;
	
	if(i==0) {
		
		int j=this.name.compareTo(o.name);
		if(j==0) {
			return this.address.compareTo(o.address);
		}
		return j;
	}
	
	
	
	//@Override
	//public int compareTo(Employee o) {
		//return id;
		
		//return o.id-this.id;
		//return this.id-o.id;
		//return this.name.compareTo(o.name);
	 // return this.address.compareTo(o.address);
	return this.id-o.id;
	}
	
	
}
class orderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//return o1.getId()-o2.getId();
		
		return o1.getName().compareTo(o2.getName());
				//return o1.getAddress().compareTo(o2.getAddress());
		//int i =o1.getId()-o2.getId();
		//if(i==0) {
			//int j= o1.getName().compareTo(o2.getName());
			//if(j==0) {
			//return o1.getAddress().compareTo(o2.getAddress());
		}
			//return j;
		
	
		
	
}

