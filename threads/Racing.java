package com.rays.threads;

public class Racing extends Thread{
	
	public static Account data=new Account();
	
	public Racing(String name) {
		super(name);
		
	}
	public void run() {
		
		for (int i = 0; i < 5; i++) {
		
			data.deposite(getName(),100);
			
			
		}
	}
	

}
