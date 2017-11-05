package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo5 {
	public static void main(String[] args) {
		
	//Preceding sub pattern for {min,max} quantifier must appear 'at least ‘min’ times and not more than ‘max’ times 
	
		//Using Quantifier with single character
	/*	Pattern p = Pattern.compile("H{2,5}");
		Matcher m = p.matcher("HHHHH");
		boolean b = m.matches();
		System.out.println(b);
	*/
	
	/*	Pattern p = Pattern.compile("AH{2,5}");
		Matcher m = p.matcher("AHH");
		boolean b = m.matches();
		System.out.println(b);
	*/

		//Use grouping to apply quantifier for many characters
	/*	Pattern p = Pattern.compile("(ab){2,4}");
		Matcher m = p.matcher("abababab");
		boolean b = m.matches();
		System.out.println(b);
	*/
		//Using Quantifier with metacharacter
	/*	Pattern p = Pattern.compile("\\w{2,4}");
		Matcher m = p.matcher("Q1P7");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
			 		
		// Grouping with metacharacters
	/*	Pattern p = Pattern.compile("(\\d\\w){2,4}");
		Matcher m = p.matcher("2Q6E5T4W");
		boolean b = m.matches();
		System.out.println(b);
	*/ 

	}
}
