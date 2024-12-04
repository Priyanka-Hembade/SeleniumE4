package javautility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class DateFormat {

	@Test
	public void  main()
	{
		   Date date = new Date();
		   System.out.println(date);
		   SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		   String currentDate = sim.format(date);
		   System.out.println(currentDate);
		   
		   //Date after some days
		   Calendar cal = sim.getCalendar();
		   cal.add(Calendar.DAY_OF_MONTH,90);
		    String afterDate = sim.format(cal.getTime());
		   System.out.println(afterDate);
		   
		   
	}
}
