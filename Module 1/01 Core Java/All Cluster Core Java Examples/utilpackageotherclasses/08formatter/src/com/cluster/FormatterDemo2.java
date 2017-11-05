package com.cluster;

import java.util.Calendar;
import java.util.Formatter;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FormatterDemo2 {
	public static void main(String[] args) {
		
		Formatter fmt1 = new Formatter();
		// formatting different data types
		fmt1.format("%c - %f - %b %n %d - %o - %x", 'c',99.99,true,25,25,25);
		System.out.println(fmt1);
		
		System.out.println();
		
		Formatter fmt2 = new Formatter();
		Calendar cal = Calendar.getInstance();
		// formatting date and time
		//for formatting date and time , use suffix with format specifier %t 
		fmt2.format("%tr %n %tc %n %tl:%tM", cal,cal,cal,cal);
		System.out.println(fmt2);
	}
}
