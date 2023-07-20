import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class testDate {
	
	private static final String Str = null;

	public static void main (String[]args) throws ParseException {
		String str="07/07/2011";
		//DateFormat sdf;
		//Date d=new Date();
		//System.out.println(d);
		

		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
				//System.out.println(sdf.format(d));
				
				Date d=sdf.parse(str);
		
		
				System.out.println(d);
		
				
	    
	}

	private static Object newSimpleFormate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
