package com.cluster;

import java.util.Calendar;
import java.util.Date;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Calendar can be used for traversing
public class CalendarDemo3 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date utilDate = cal.getTime();
		System.out.println("Current Date    : " + utilDate);
	 
		//update a date. set() method will only update the specified field 
/*		cal.set(Calendar.YEAR, 1990);
		cal.set(Calendar.MONTH, 11); // Jan = 0, Dec = 11
		cal.set(Calendar.MINUTE, 55);
		utilDate = cal.getTime();
		System.out.println("Updated Date    : " + utilDate);
*/
	
		// adding and subtracting from calendar
		// adding 3 months
/*		cal.add(Calendar.MONTH, 3);
		utilDate = cal.getTime();
		System.out.println("Adding 3 months : " + utilDate);
	 
		//subtract 10 days
		cal.add(Calendar.DAY_OF_MONTH, -10);
		utilDate = cal.getTime();
		System.out.println("Subtract 10 days: " + utilDate);

*/		
		// roll will add the value to the specified field without changing other fields
		cal.roll(Calendar.MONTH, 3);
		utilDate = cal.getTime();
		System.out.println("Rolling 3 months: " + utilDate);

		}
}
