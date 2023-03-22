package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args)throws Exception {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(date);
		System.out.println(format1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(date);
		System.out.println(format2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20");
		System.out.println(parsedDate);
		
		
	}

}
