package com.rays.constructorcalling;

public class Shap {
	
	private String color=null;
	private int bourderWidth;
	
	public Shap() {
	System.out.println("shap default");	
		
	}
	
	public Shap(String color,int bourderWidth) {
		this();
		this.bourderWidth=bourderWidth;
		this.color=color;
		
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBourderWidth(int bourderWidth) {
		this.bourderWidth = bourderWidth;
	}
	
	public int getBourderWidth() {
		return bourderWidth;
	}

}
