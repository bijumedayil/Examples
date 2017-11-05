package com.cluster;

import java.util.Date;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DateDemo1 {
	public static void main(String args[]) {

		// create a date object based on the current locale
		// system settings will be considered
		Date date = new Date();
		System.out.println(date);

		// Display number of milliseconds since midnight, January 1, 1970 till today
		long msec = date.getTime();
		System.out.println("Milliseconds since Jan 1, 1970 :- " + msec);

		// Display number of milliseconds since midnight, January 1, 1970 till today
		long ms = System.currentTimeMillis();	
		System.out.println("System.currentTimeMillis: "	+ ms);

	}
}
