package com.rays.threads;

public class TestAccount {
	public static void main(String[] args) {
		
		Racing r1=new Racing("ram");
		Racing r2=new Racing("shyam");
		r1.start();
		r2.start();
	} 

}
