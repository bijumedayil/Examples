package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo4 {
	public static void main(String[] args) {
		
		//Preceding sub pattern for {n} quantifier must appear 'n' number of times 
		
		//Using Quantifier with single character
	/*	Pattern p = Pattern.compile("H{4}");
		Matcher m = p.matcher("HHHH");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
	/*	Pattern p = Pattern.compile("AH{4}");
		Matcher m = p.matcher("AHHHH");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Use grouping to apply quantifier for many characters
	/*	Pattern p = Pattern.compile("(ab){4}");
		Matcher m = p.matcher("abababab");
		boolean b = m.matches();
		System.out.println(b);
	 */
		
		//Using Quantifier with metacharacter
	/*	Pattern p = Pattern.compile("\\w{4}");
		Matcher m = p.matcher("Q1P7");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
			
		// Grouping with metacharacters
	/*	Pattern p = Pattern.compile("(\\d\\w){4}");
		Matcher m = p.matcher("2Q6E8T4W");
		boolean b = m.matches();
		System.out.println(b);
	*/	
	}
}
