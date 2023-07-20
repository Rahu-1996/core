package com.rays.exception;

public class TestChecked {
	 public static void main(String[] args) {
			
	    	int a=20;
	    	if(a>30); {
	    		
	    		try {
	    			
	    		throw new Checked();
	    		}
	    		catch (Checked e) {
	    			System.out.println(e);
				
			} 
	    		
	    	}
		

	    }
}