package com.rays.threads;

public class TextThread {
public static void main(String[] args) {
		
		WithThreads t1=new WithThreads("syam");
		t1.setPriority(1);
		WithThreads t2=new WithThreads("ram");
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
