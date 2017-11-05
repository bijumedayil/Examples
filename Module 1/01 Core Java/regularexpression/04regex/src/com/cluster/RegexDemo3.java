package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to show doing replace using regex
public class RegexDemo3 {
	public static void main(String[] args) {

		// build a pattern
		Pattern p = Pattern.compile("dog");
		// get a matcher object
		Matcher m = p.matcher("The dog says meow. All dogs say meow.");
		// do replacement
		String s = m.replaceAll("cat");
		System.out.println(s);
	}
}