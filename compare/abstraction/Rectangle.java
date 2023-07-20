package com.rays.abstraction;


public class Rectangle extends Shap{
	private int length=0;
	private int breath=0;
	
	

	public void area() {
		int ar=(length*breath);
		System.out.println(ar);
	}
	
	public Rectangle(int length,int breath) {
		
		
		System.out.println(this.length=length);
		System.out.println(this.breath=breath);
		
	}

}
