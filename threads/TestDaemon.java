package com.rays.threads;

public class TestDaemon {
	public static void main(String[] args) {
		 DaemonThread t1=new DaemonThread("rahul");
		 DaemonThread t2=new DaemonThread("Shyam");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}