/**
 * 
 */
package com.vtiger.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author ASUS
 *
 */
public class DateUtility {
	
	
	public static Calendar cal;
	public static Date date;
	public static  DateFormat dateFormat;
	 static String currentDate;
	
	public static String getTodaysSystemDateInFormart()
	{
		   	 cal = Calendar.getInstance();
		   	 date =cal.getTime();
	        dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        currentDate =dateFormat.format(date);
			return currentDate;
		
	}
	
	public static Date getPastOrFutureDatFromTodayInFormart(int days){
		
	
		
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
	   	 date =cal.getTime();
		return date;
      
	
}
	
	

}
