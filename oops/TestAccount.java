package com.rays.oops;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a =new Account();
		a.setAccountNum(99369677);
		a.setAccountType("saving"); 
		a.setBalance(8000);
		a.setDeposite(2000);
		a.setWithdraw(200);
		a.setFundTransfer(500);
		a.setPayBill(5000);
		
		System.out.println(a.getAccountType());
		System.out.println(a.getAccountNum());
		System.out.println(a.getBalance());
		System.out.println(a.getDeposite());
		System.out.println(a.getWithdraw());
		System.out.println(a.getFundTransfer());
		System.out.println(a.getPayBill());
		
	}

}
