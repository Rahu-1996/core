package com.rays.threads;

public class WithThreads extends Thread{
	private String name=null;
	public WithThreads(String name) {
		this.name=name;
	}
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i+" "+name);
			
		}
		
	}


}
