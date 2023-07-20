package com.rays.oops;

public class Automobile {
	private String color="red";
	private int speed =500;
	private String make="TVS";
	public static final int No_of_gears = 1;
	
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color=color;
		
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
		
	}
	
	public String getMake() {
		return make;
	
	}
    public void setMake(String make) {
    	this.make=make;
    	
    }
    public void breck(int b) {
    	int br=b;
    	
    }
    public void changegear(int c) {
    	speed=speed-c;
    	
    }
    public void accelrtore(int ac) {
    	speed=speed+ac;
    	
    }
}
