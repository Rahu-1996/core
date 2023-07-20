package com.rays.oops;


public class Account {
	private String accountType =null;
    private int accountNum=0;
	private int balance=0;
	private int deposite=0;
	private int withdraw=0;
	private int fundTransfer=0;
	private int payBill=0;
	
	
	public int getAccountNum() {
		return accountNum;
		
	}
	public void setAccountNum(int accountNum) {
		this.accountNum=accountNum;
	
	}
	
	public String getAccountType() {
		return accountType;
		
	}
	
	public void setAccountType(String accountType) {
		this.accountType=accountType;
		
	}
	

	
	
	public int getBalance() {
	return balance;
	}
	
		public void setBalance(int balance) {
			this.balance=balance;
		}
	

	public int getDeposite() {
		return deposite;
	}

	public void setDeposite(int deposite) {
		this.deposite = getBalance()+deposite;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = getDeposite()-withdraw;
	}
		
		public int getFundTransfer() {
			return fundTransfer;
			
		}
		public void setFundTransfer(int FundTransfer) {
			this.fundTransfer=getWithdraw()+FundTransfer;
			
		}
		
		public int getPayBill() {
			return payBill;
			
			
		}
		
	public void setPayBill(int PayBill) {
		this.payBill=getFundTransfer()+PayBill;
		
	
		
	}

		
	}
	


