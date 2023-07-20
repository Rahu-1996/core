package com.rays.overridingconstructor;

public class TestShap  {
	
	public static void main(String[] args) {
		Shap s[]=new Shap[2];
		s[0]=new Triangle("triangle",4,5);
		s[1]=new Circle("circle",2);
	
		for(int i=0; i<s.length; i++) {
			
			System.out.println(s[i].shapName);
			s[i].pointArea();
		}
	}

}
