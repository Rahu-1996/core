package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {
		
	Account a=new Account();
	a.deposite(5000);
	try {
		a.withdraw(500);
	} catch (Exception e) {
	System.out.println(e);
	}
	//System.out.println("khali");
	}

}
