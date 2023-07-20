import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		
	
		int number, reversed=0;
		System.out.println(123456);
		Scanner ref=new Scanner(System.in);
		
	number=ref.nextInt();
	
		while(number>0) {
			
			reversed=number%10;
			System.out.println("Reverse order"+reversed);
			number=number/10;
		}
	}
	}
     
