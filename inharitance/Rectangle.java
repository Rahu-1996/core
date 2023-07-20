package com.rays.inharitance;

public class Rectangle extends Shap{
	
	private int length=0;
	private int width=0;
	
	public Rectangle(int i,int j) {
		length=i;
		width=j;
	}
	
		public Double area(){
			return (double)(length*width);	
			
	}
	
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width*length;
	}
	
	
	public int getWidth() {
		return width;
	}
}
