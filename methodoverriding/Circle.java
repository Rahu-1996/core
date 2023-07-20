package com.rays.methodoverriding;

public class Circle extends Shap {
	private static final double pi=3.14;
	private double radius;
	public Circle() {
		radius=pi;
		
	}
    public Double area() {
		return pi * radius;
		

	
	
}

	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return 0;
		
	}
	
	
}