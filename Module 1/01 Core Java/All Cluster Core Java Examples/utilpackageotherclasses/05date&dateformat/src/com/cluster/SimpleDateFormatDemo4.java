package com.cluster;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

/**
 * This example shows the capability of SimpleDateFormat class. SimpleDateFormat
 * is a concrete class for formatting and parsing dates in a customized manner.
 * It allows for formatting (date to string), parsing (string to date)
 * 
 */

// use format() to convert Date to String
// use parse() to convert String to Date
public class SimpleDateFormatDemo4 {
	public static void main(String[] args) {

		// Formatting or converting util.Date to String
		System.out.println("CONVERTING DATE TO STRING");
		Date utilDate = new Date();
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("hh:mm:ss");
		String strDate1 = formatter1.format(utilDate);
		
		System.out.println(strDate1);

		formatter1 = new SimpleDateFormat("EEE/dd/MMM");
		System.out.println(formatter1.format(utilDate));

		formatter1 = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");
		System.out.println(formatter1.format(utilDate));
		System.out.println();
		
		// Formatting or converting Calendar to String
		System.out.println("CONVERTING CALENDAR TO STRING");
		// Get today's date
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter2 = new SimpleDateFormat("EEE yyyy.MM.dd 'at' hh:mm:ss a zzz");
		String  strDate2 = formatter2.format(cal.getTime());
		System.out.println( strDate2);
		System.out.println();
		
		// Parsing or converting String to util.Date
		System.out.println("CONVERTING STRING TO DATE");
		String strDate3 = "11-March-2009";
		DateFormat formatter3 = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			Date date = formatter3.parse(strDate3);
			System.out.println(date);
			System.out.println();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
