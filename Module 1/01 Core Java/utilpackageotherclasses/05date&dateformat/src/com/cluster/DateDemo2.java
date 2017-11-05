package com.cluster;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to show different date conversions 
// util.date to sql.date,  util.Date to sql.TimeStamp, Calendar to util.Date
public class DateDemo2 {
	public static void main(String[] args) {

		// creating util date
		java.util.Date utilDate = new java.util.Date();
		System.out.println("Util Date1 : " + utilDate);

		// creating sql date or converting util.Date to sql.Date
		Date sqlDate1 = new Date(utilDate.getTime());
		System.out.println("SQL Date1  : " + sqlDate1);

		// creating sql date
		Date sqlDate2 = new Date(System.currentTimeMillis());
		System.out.println("SQL Date2  : " + sqlDate2);
		
		// creating sql date
		Date sqlDate3 = new Date(0);
		System.out.println("SQL Date3  : " + sqlDate3);

		// creating TimeStamp or converting util.Date to TimeStamp 
		Timestamp timestamp1 = new Timestamp(utilDate.getTime());
		System.out.println("Timestamp1 : " + timestamp1);
		
		Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
		System.out.println("Timestamp2 : " + timestamp2);
	
		// creating calendar
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar   : " + cal);
		
		// converting Calendar to util.Date
		java.util.Date utilDate2 = cal.getTime();
		System.out.println("Util date2 : " + utilDate2);
	}
}
