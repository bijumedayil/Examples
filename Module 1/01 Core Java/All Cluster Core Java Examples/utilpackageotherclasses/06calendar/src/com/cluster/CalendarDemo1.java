package com.cluster;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CalendarDemo1 {
	public static void main(String[] args) {

		// creating Calendar and getting current date and time 
		Calendar cal1 = Calendar.getInstance();
		System.out.println("Calendar: " + cal1);

		// converting Calendar to util.Date
		Date utilDate = cal1.getTime();
		System.out.println("Converting calendar to util date: " + utilDate);
		
		System.out.println();
		
		// creating GregorianCalendar based on default locale.
		GregorianCalendar gc1 = new GregorianCalendar();
		System.out.println("Gregorian Calendar1 : " + gc1);
		
		// converting Calendar to util.Date
		utilDate = gc1.getTime();
		System.out.println("Converting calendar to util date: " + utilDate);

		System.out.println();
		
		// Creating calendar for our required date
		GregorianCalendar gc2 = new GregorianCalendar(1990,1,28,13,24,56);
		System.out.println("Gregorian Calendar2 : " + gc2);
		
		utilDate = gc2.getTime();
		System.out.println("Converting calendar to util date: " + utilDate);
		
	}

}
