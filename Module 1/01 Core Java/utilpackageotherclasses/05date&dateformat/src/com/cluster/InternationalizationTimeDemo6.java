package com.cluster;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class InternationalizationTimeDemo6 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Default time - " + date);
		DateFormat df;
		
		System.out.println();

		// for formatting time use getTimeInstance() method
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("India full time: " + df.format(date));
		
		System.out.println();
		// formatting time for US country 
		System.out.println("Printing US time**********");
		df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
		String str = df.format(date);
		System.out.println("US full time  : " + str);
		
		df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
		System.out.println("US long time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("en", "US"));
		System.out.println("US medium time: " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("en", "US"));
		System.out.println("US short time : " + df.format(date));
		
		System.out.println();
		
		// formatting time for UK country
		System.out.println("Printing UK time**********");
		df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK);
		System.out.println("UK full time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
		System.out.println("UK long time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("en", "GB"));
		System.out.println("UK medium time: " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("en", "GB"));
		System.out.println("UK short time : " + df.format(date));
	
		System.out.println();
		
		// formatting time for France country
		System.out.println("Printing FRANCE time**********");
		df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println("FRANCE full time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.FRANCE);
		System.out.println("FRANCE long time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("fr", "FR"));
		System.out.println("FRANCE medium time: " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("fr", "FR"));
		System.out.println("FRANCE short time : " + df.format(date));
		
		System.out.println();
		
		// formatting time for Italy country
		System.out.println("Printing ITALY time**********");
		df = DateFormat.getTimeInstance(DateFormat.FULL, new Locale("it", "IT"));
		System.out.println("ITALY full time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("it", "IT"));
		System.out.println("ITALY long time  : " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("it", "IT"));
		System.out.println("ITALY medium time: " + df.format(date));
		
		df = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("it", "IT"));
		System.out.println("ITALY short time : " + df.format(date));
		
	}
}
