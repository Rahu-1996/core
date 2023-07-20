import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender{

	public static void main(String[]args) {
		
		Date toaday=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		
		Calendar cal=Calendar.getInstance();
		
		
	 cal.setTime(toaday);
	
	//cal.add(Calendar.DATE,30);
	for(int i=1; i<=12; i++)
	
	{
		cal.add(Calendar.DATE,30);
	
	
	System.out.println(cal.getTime());
	}
	}

}
