package com.rays.constructor;

public class Constructor {
	private int id =0;
	private String name=null;
	private	 String address=null;	

   
    public Constructor() {
    	
    	
    }
    
    public Constructor(int id,String name,String address) {
    	
    	System.out.println(this.id=id);
    	System.out.println(this.name=name);
    	System.out.println(this.address=address);
    
    }
    
    

}