package com.rays.inharitance;

public class Triangle extends Shap{
	
	private int base;
	private int height;
	public Triangle (int i, int j) {
		base=i;
		height=j;
		
	}
	
	
	public Double area() {
		return null;
		
		
	}

	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}


	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height*base;
	}

	}


