package com.rays.oops;


public class TestAutomobile {
	

	public static void main(String[] args) {
		
	
	Automobile a=new Automobile();
	
	           a.setColor("red");
               a.setSpeed(100);
               a.setMake("TVS");
              a.accelrtore(2);
               a.breck(3);
               a.changegear(4);
               
           System.out.println(a.getColor());
            System.out.println(a.getSpeed());
            System.out.println(a.getMake());
           
}
}