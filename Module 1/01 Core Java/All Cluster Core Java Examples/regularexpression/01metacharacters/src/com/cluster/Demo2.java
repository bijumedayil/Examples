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
		//Matches any single character other than new line (A to Z a to z 0 to 9 and special symbols like @ & $ , % etc)
	/*	Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("$");
		boolean b = m.matches();
		System.out.println(b);
	*/
	
		
		//Matches any two characters  (A to Z a to z 0 to 9 and special symbols like @ & $ , % etc)
	/*	Pattern p = Pattern.compile("..");
		Matcher m = p.matcher("12");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Matches any three characters  (A to Z a to z 0 to 9 and special symbols like @ & $ , % etc)
	/*	Pattern p = Pattern.compile("...");
		Matcher m = p.matcher("@$%");
		boolean b = m.matches();
		System.out.println(b);
	*/
	}
}
