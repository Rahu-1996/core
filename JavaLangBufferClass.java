
public class JavaLangBufferClass {
	
	public static void main(String[]args) {
		
		StringBuffer sb=new StringBuffer("Seeta");
		
		sb.append("Ram Charitmanas");
		
		System.out.println("Length:"+sb.length());
		
		System.out.println("Capacity:"+sb.capacity());
		
		System.out.println("Char at:"+sb.charAt(7));
		
		System.out.println("IndexOf:"+sb.indexOf("Ram"));
		
		System.out.println("Replace:"+sb.replace(0,5,"manas"));
		
		System.out.print("Reverse:"+sb.reverse());
		
		
	}

}
