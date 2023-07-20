package com.rays.inharitance;

public class Circle  extends Shap{
	
	private static final double pi=3.14;
	private double radius;
	public Circle(int i) {
		radius=i;
		
	}
    public Double area() {
		return pi * radius* radius;
		

	
	
}

	public Circle() {
		// TODO Auto-generated constructor stub
	}




	public double getRadius() {
	   return radius;
}
     
    private void setRedius(double d) {
		this.radius=d;

	}
    
     public Double area(double d) {
		return null;
    	 
     }

}
