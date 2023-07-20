
public class Firstdaray {
	
	public static void main (String[]args) {
		
	//	int[]arr= {10,78,56,8,57,89,456};
		
		int[]table=new int[100];
		
		for(int i=0; i<table.length; i++) {
			
			table[i]=(i+1)*2;
			
		}
		
		for(int j:table) {
			
			System.out.println(j);
		}
	}

}
