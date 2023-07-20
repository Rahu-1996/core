package com.rays.inharitance;

public class TestShap {
	        public static void main(String[] args) {
				Shap[]s= new Shap[3];
				s[0]=new Circle(5);
				s[1]=new Rectangle(10, 20);
				s[2]=new Triangle(2,3);
				for(Shap sh:s) {
					System.out.println(sh.area());
				}
			}
	}
		
		
