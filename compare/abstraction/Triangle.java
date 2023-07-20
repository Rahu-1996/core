package com.rays.abstraction;

public class Triangle extends Shap {
	
	public int base=0;
	public int height=0;
	
	public Triangle(int base,int height) {
		
		System.out.println(this.base=base);
		System.out.println(this.height=height);
	}
		public void area(){
			int ar=(base*height);
			System.out.println(ar);
			
		}
		
		
	}


