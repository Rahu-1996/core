package com.rays.threads;


public class Account {
	
	private int balance=0;
	
		public synchronized void deposite(String msg, int amt){
				
			
			int bal=getBalance()+amt;
			setBalance(bal);
				
			System.out.println(msg+" "+balance);
		}		
		
			public void setBalance(int balance) {
		
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
		
	}
    public void databaseDelay() {
    	try {
    		Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
    }
		
	}
	

