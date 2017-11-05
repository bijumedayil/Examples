package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class RegexDemo1 {

	public static void main(String[] args) {

		// Validate first name for minimum 4 and maximum 15 characters    
	/*	Pattern p = Pattern.compile("[A-Za-z]{3,15}");
		Matcher m = p.matcher("Ravi");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		// Validating password for alpha numeric
	/*	Pattern p = Pattern.compile("\\w{4,15}");
		Matcher m = p.matcher("Ravi123");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		// Validating date of birth in the format 12-03-2013
	/*	Pattern p = Pattern.compile("\\d{1,2}-\\d{1,2}-\\d{4}");
		Matcher m = p.matcher("11-05-2010");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		// Validating phone for 10 digits
	/*	Pattern p = Pattern.compile("(\\d){10}");
		Matcher m = p.matcher("9845012345");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		// Validating email
	/*	Pattern p = Pattern.compile("(\\w)+@(\\w)+\\.\\w{2,3}");
	// 	Pattern p = Pattern.compile("[a-zA-z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{2,3}");
		Matcher m = p.matcher("ravikumar12@cluster.com");
		boolean b = m.matches();
		System.out.println(b);
	*/ 
		
	}
}
