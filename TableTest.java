
public class TableTest {
	public static void main(String[]args) {
	//max(40, 80);
		
		//tabale(20);
	
		//AddlastName();
		ArayMissingNumber();
		
		
	}
	public static int tabale(int n) {
		int t = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				t =i*j;
				System.out.print(t + "\t");
				
			}
			System.out.println();
		}
		return 0;
	}  
	public static String AddlastName() {
	
	String str=new String();
	String b = "Choudhary";
	str = "Rahul "+ b;
	System.out.println(str);
	return str;
}
	
	
	public static int max(int a,int b) {
		if(a>b) {
			
			System.out.println("a is grater");
			}else {
				System.out.println("b is grater");
				
				
				
			}
		return 0;
		
		
	}
	
	public static void ArayMissingNumber() {
	int[]A= {1,2,3,5,7,9};
	
	int[]B= {1,2,3,7,5};
	
	int sumA=0;
	
	for(int num: A)
	
	{
		
	sumA=sumA+num;	
			
	}
	
	int sumB=0;
	{
		for(int num:B)
		{
			
			sumB=sumB+num;
			
		}
	}
	
	int array=sumA-sumB;
	
	System.out.println(array);
	
}
}