
public class ArrayPrime {
	
	public static void main(String[]args) {
		
		int[]arr= {10,5,11,12,15,6,8,20,13,17};
		
		int count=0;
	
		 for(int n=1; n<arr.length; n++)
		 {
			 
			 for(int i=2; i<arr[n]; i++)
			 {
				 
				if(arr[n]%i==0) {
					
					count++;
				}
			 }
			 
			 if(count==0)
			 //if(count!=0) Note prime member
			 {
				 
				 System.out.println("prime number"+arr[n]);
				 
				 
				 	
			 }
			 count=0;
		 }
		 
	}

}