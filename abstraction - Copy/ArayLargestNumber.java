
public class ArayLargestNumber {

public static void main(String[]args) {
		
		//         0   1   2  3   4   5    6
		int []arr={10,5000,3000,50, 60, 111, 200,};
		
		int min=0;
	    int max=0;
	    
	    for(int i=0; i<arr.length; i++) {
	    	
	    	
	      if(arr[i]>max) {
	    	  
	    	  min=max;
	    	  max=arr[i];
	      }
	    }
	      System.out.print("max value="+max);

	    
}

}