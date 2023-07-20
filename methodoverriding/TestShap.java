package com.rays.methodoverriding;

public class TestShap {
	public static void main(String[] args) {
		
		Shap s=new Rectangle();
		Rectangle r=new Rectangle() ;
				Shap s1=new Triangle();
				Triangle t=new Triangle();
				Circle s2=new Circle();
				Circle c=new Circle();
					
		r.area(2,5);
		r.setColor("red");
		r.setBorderWidth(30);
		r.setLength(20);
		r.setWidth(10);
		t.setBase(50);
		t.setHeight(5);
		c.area();
		c.setRadius(5);
	
		
		
	    System.out.println(r.area());
	    System.out.println(c.area());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(t.getBase());
		System.out.println(c.getRadius());
		System.out.println(t.getHeight());
	}

}
