import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		int a[]= {29,50,55,60,70,75,62,63};
		
		System.out.println("odd number");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2!=0)
			{
				
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println("even number");
		
		for (int i = 0; i < a.length; i++) 
			
			if(a[i]%2==0) {
				System.out.println(a[i]);
				
			}
			
			
			
		}
		
}
