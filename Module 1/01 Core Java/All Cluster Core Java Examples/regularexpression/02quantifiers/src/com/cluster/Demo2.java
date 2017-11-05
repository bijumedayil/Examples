package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo2 {
	public static void main(String[] args) {
	
		//Preceding sub pattern for * quantifier must appear zero or more times 
	
		//Using Quantifier with single character
	/*	Pattern p = Pattern.compile("H*");
		Matcher m = p.matcher("HHHH");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
	/*	Pattern p = Pattern.compile("AH*");
		Matcher m = p.matcher("AH");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Use grouping to apply quantifier for many characters
	/*	Pattern p = Pattern.compile("(ab)*");
		Matcher m = p.matcher("ababab");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Using Quantifier with metacharacter
	/*	Pattern p = Pattern.compile("\\w*");
		Matcher m = p.matcher("Q1P4R");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		// Grouping with metacharacters
	/*	Pattern p = Pattern.compile("(\\d\\w)*");
		Matcher m = p.matcher("2Q6E5T");
		boolean b = m.matches();
		System.out.println(b);
	 */
	}
}
