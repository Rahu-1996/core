package com.rays.constructorcalling;

public class Rectangle extends Shap {
	private int length;
	private int width;
	
	
	public Rectangle() {
		System.out.println("Rectangle default");
		
	}
	
	public Rectangle(int length,int width,String color,int bourderWidth) {
		super(color,bourderWidth);
		this.length=length;
		this.width=width=width;
		
	}
	
	
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

}
