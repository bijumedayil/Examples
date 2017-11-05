package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo1 {
	public static void main(String[] args) {
		// program to show creating regex with normal character
		// Will match only Ravi
		Pattern p = Pattern.compile("Ravi"); // build regular expression
		Matcher m = p.matcher("Ravi");// provide source
		boolean b = m.matches(); // invoke regex engine
		System.out.println(b);
	 
		
		// Will match only Ravi or Amogh or Balaji or Vinay
	/*	Pattern p = Pattern.compile("Ravi|Amogh|Balaji|Vinay");
		Matcher m = p.matcher("Ravi");
		boolean b = m.matches();
		System.out.println(b);
	*/
	}
}
