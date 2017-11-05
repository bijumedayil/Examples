package com.cluster;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DateFormatDemo3 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Default date - " + date);

		System.out.println();
		System.out.println("Formatting Date*********");
		
		// for formatting date use getDateInstance() method	and then use format() method	
		DateFormat	df1 = DateFormat.getDateInstance(DateFormat.FULL);
		String strDate = df1.format(date);
		System.out.println("India full date  : " + strDate);
		
		df1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("India long date  : " + df1.format(date));

		df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("India medium date: " + df1.format(date));
		
		df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("India short date : " + df1.format(date));

		System.out.println();
		System.out.println("Formatting Time*********");
		
		// for formatting time use getTimeInstance() method and then use format() method
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("India full time  : " + df2.format(date));
		
		df2 = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println("India long time  : " + df2.format(date));

		df2 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("India medium time: " + df2.format(date));
		
		df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println("India short time : " + df2.format(date));

	}
}
