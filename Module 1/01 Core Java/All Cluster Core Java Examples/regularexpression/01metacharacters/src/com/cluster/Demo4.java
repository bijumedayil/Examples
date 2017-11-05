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
		//Matches a single alphha numeric character or underscore
	/*	Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("1");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Matches any two alphha numeric character or underscore
	/*	Pattern p = Pattern.compile("\\w\\w");
		Matcher m = p.matcher("c7");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Matches any three alphha numeric character or underscore
	/* 	Pattern p = Pattern.compile("\\w\\w\\w");
		Matcher m = p.matcher("2A_");
		boolean b = m.matches();
		System.out.println(b);
	 */
	}
}
