package com.rays.methodoverriding;

public class Rectangle extends Shap{
	private int length=0;
	private int width=0;
	private int area;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
   
	public Double area(){
		return (double)(length*width);	
		
	}

	public void area(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
}
