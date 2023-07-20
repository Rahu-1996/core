package com.rays.collectionframework;

public class TestHashCode {
	public static void main(String[] args) {
		
	
	
		HashCode h1=new HashCode(1,"ram");
		HashCode h2=new HashCode(1,"ram");
		
		Employee e=new Employee(1,"ram");
		
		System.out.println();
		
	System.out.println(e.equals(h2));
	
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());

	
	}

}