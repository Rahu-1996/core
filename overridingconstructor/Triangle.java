package com.rays.overridingconstructor;

public class Triangle extends Shap {
	
	private  double base;
	private double height;
	
	public Triangle(String shapName,double base,double height) {
	    super(shapName);
		this.base=base;
		this.height=height;
	}
	
	public void pointArea() {
		double area=0.5*base*height;
		System.out.println("Area of the triangle"+area);
	}

}
