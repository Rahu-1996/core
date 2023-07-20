package com.rays.exception;

public class TestTryCatch  {
	
	public static void main(String[] args) {
	
	try{
		int a=10;
		//System.out.println("a="+a);
		int b=4;
		//System.out.println("b="+b);
		
		int c=a/b;
		
		System.out.println("Division="+c);
	
    
	String name="shyam";
	System.out.println(name.length());
	System.out.println(name.charAt(3));
	}
	catch (Exception e){
		System.out.println(e);
	}
	finally {
		System.out.println("finally block");
		
	}
	
	
	System.out.println("after division");
	
    }
	}