package com.rays.overridingconstructor;

public class Circle extends Shap {
	
	private double radius;
	
	public Circle(String shapName,double radius) {
		
		super(shapName);
		this.radius=radius;
		
	}
	
	public void  pointArea() {
		double area=Math.PI*radius*radius;
		System.out.println("Area of the circle:"+area);
	}

}
