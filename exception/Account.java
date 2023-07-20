package com.rays.exception;

public class Account {
	private int balance=0;
    
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposite(int amount) {
		int total=getBalance() + amount;
		setBalance(total);
		System.out.println("Balance After Deposite="+getBalance());
		
		
	}
	public void withdraw(int amount)throws LowBalance {
		
		int total=getBalance()-amount;
		if(total<5000) {
			throw new LowBalance();
			
		}else {
			setBalance(total);
			System.out.println("Balance After withdraw="+getBalance());
		}
	}
		
	}
		
		
	

