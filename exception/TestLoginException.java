package com.rays.exception;



public class TestLoginException  {
	
	public static void main(String[] args) {
		
		try {
		String name="Mishra";
		
		if(name.equals("Mishri")){
			System.out.println("valid user..");	
		}
		else {
			  throw new LoginExcaption ();
			
		}
		
	}catch(Exception e){
		
		System.out.println(e);
	}

}
}