package com.cluster;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class InternationalizationDateDemo5 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Default date - " + date);
		DateFormat df;
		
		System.out.println();

		// for formatting date use getDateInstance() method
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("India full date: " + df.format(date));
		
		System.out.println();
		// formatting date for US country 
		System.out.println("Printing US Date**********");
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		String strDate = df.format(date);
		System.out.println("US full date  : " + strDate);
		
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println("US long date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en", "US"));
		System.out.println("US medium date: " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("en", "US"));
		System.out.println("US short date : " + df.format(date));
		
		System.out.println();
		
		// formatting date for UK country
		System.out.println("Printing UK Date**********");
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		System.out.println("UK full date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		System.out.println("UK long date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en", "GB"));
		System.out.println("UK medium date: " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("en", "GB"));
		System.out.println("UK short date : " + df.format(date));
	
		System.out.println();
		
		// formatting date for France country
				System.out.println("Printing FRANCE Date**********");
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println("FRANCE full date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		System.out.println("FRANCE long date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("fr", "FR"));
		System.out.println("FRANCE medium date: " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("fr", "FR"));
		System.out.println("FRANCE short date : " + df.format(date));
		
		System.out.println();
		
		// formatting date for Italy country
		System.out.println("Printing ITALY Date**********");
		df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("it", "IT"));
		System.out.println("ITALY full date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("it", "IT"));
		System.out.println("ITALY long date  : " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("it", "IT"));
		System.out.println("ITALY medium date: " + df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("it", "IT"));
		System.out.println("ITALY short date : " + df.format(date));
		
	}
}
