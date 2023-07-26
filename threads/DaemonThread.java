package com.rays.threads;

public class DaemonThread extends Thread {
	
	public String name=null;

public DaemonThread(String name) {
	this.name=name;
	
}
    public void run() {
    	for (int i = 0; i < 5; i++) {
			
		
		System.out.println(i  +name);
		
			
		}
		
	while(true){
		try {
			Thread.sleep(500);
			//System.out.println("Damon T:woke up again");
			
			
		} catch (Exception e) {
		
		}
		
	}

			
		
}	
		
	}
	


