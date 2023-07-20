
public class Arrayevenodd {

	public static void main (String[]args) {
		
		int a[]= {50,8,1,56,78,89,88,98090,677876,11,5,13,17,345};
		
		System.out.print("odd number");
		
		for(int x=0;x<a.length;x++) {
		
		if (a[x]%2!=0)
		{
			
			System.out.println(a[x]);
			
			
		}
		

	}
	
	System.out.println("even number");
	
	for(int x=0; x<a.length;x++)
		
		if (a[x]%2==0)
			
			System.out.println(a[x]);

}
}