package com.rays.threads;

public class TestRunnable {
	public static void main(String[] args) {
		
		HelloRunnable r1=new HelloRunnable("shyam");
		HelloRunnable r2=new HelloRunnable("shree");
		
		
	    Thread t1=new Thread(r1);
	    t1.setPriority(10);
	    Thread t2=new Thread(r2);
	    
	    t1.start();
		t2.start();
	}

}
