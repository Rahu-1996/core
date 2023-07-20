package com.rays.clonnig;

public class TestCostomer {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Costomer c1= new Costomer("Rahul");
		Costomer c2=(Costomer) c1.clone();
		c2.name="shyam";
		c2.account.balance=100;
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}

}
