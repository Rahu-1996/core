package com.rays.interfaces;

public class Businessman1 implements SocialWorker,Richmen{

	@Override
	public void earnMony() {
		int p=100000;
		System.out.println("earn:50000");
		
	
		
	}

	@Override
	public void donation() {
		int h=5000;
		System.out.println("donation : 20000");
		
	}

	@Override
	public void party() {
		int r=1000;
		System.out.println("Party : 1000");
		
	}

    public void helpToOther() {
    	System.out.println("help");
    }

	
	public void helptoOther() {
		// TODO Auto-generated method stub
		
	}

	
}