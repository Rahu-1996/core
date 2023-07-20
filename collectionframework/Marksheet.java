package com.rays.collectionframework;

public class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name=null;
	public int marks;
	
	public Marksheet(String rollNo ,String name,int marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(Marksheet o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+","+name+","+marks;
	}
	

}
