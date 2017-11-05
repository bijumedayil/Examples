package com.cluster;

import java.util.Calendar;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		
		// getting values of different fields in Calendar
		Calendar cal = Calendar.getInstance();

		int year       = cal.get(Calendar.YEAR);
		int month      = cal.get(Calendar.MONTH); // Jan = 0, Dec = 11
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = cal.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= cal.get(Calendar.WEEK_OF_MONTH);
	 
		int hour       = cal.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = cal.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = cal.get(Calendar.MINUTE);
		int second     = cal.get(Calendar.SECOND);
		int millisecond= cal.get(Calendar.MILLISECOND);
	 
	 
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
	 
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);

	}

}
