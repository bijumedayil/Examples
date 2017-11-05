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
		
		//Matches a single whitespace character. (In java whitespace means space, newline, tab & carriage return) 
	/*	Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(" ");
		boolean b = m.matches();
		System.out.println(b);
	*/
					
		//Matches any two whitespace character
	/*	Pattern p = Pattern.compile("\\s\\s");
		Matcher m = p.matcher("		");
		boolean b = m.matches();
		System.out.println(b);
	*/
					
		//Matches any three whitespace character
	/*	Pattern p = Pattern.compile("\\s\\s\\s");
		Matcher m = p.matcher("\n \r");
		boolean b = m.matches();
		System.out.println(b);
	 */
	}
}
