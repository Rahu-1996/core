package com.rays.clonnig;

public class Costomer implements Cloneable {
	
	String name=null;
	
	Account account=null;
	
	public Costomer(String name) {
		this.name=name;
		this.account=new Account(200);
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costomer c2=(Costomer)super.clone();
		account=(Account) account.clone();

		return c2 ;


		
		
	}

} 
