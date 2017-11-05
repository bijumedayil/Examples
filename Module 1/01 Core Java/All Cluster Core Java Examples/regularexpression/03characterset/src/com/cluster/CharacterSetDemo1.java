package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CharacterSetDemo1 {
	public static void main(String[] args) {
		
		//Creating character to match only A,D,r,g
	/*	Pattern p = Pattern.compile("[ADrg]");
		Matcher m = p.matcher("r");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for range of characters (only upper case letters)
	/*	Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher("A");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for range of characters (only lower case letters)
	/*	Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("p");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for range of characters (both upper and lower case letters)
	/*	Pattern p = Pattern.compile("[A-Za-z]");
		Matcher m = p.matcher("p");
		boolean b = m.matches();
		System.out.println(b);
	
	*/	
		//Creating character set for alpha numeric characters without underscore
	//	Pattern p = Pattern.compile("[A-Za-z0-9]");
		
		// \\w metacharacter allows underscore
	/*	Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("_");
		boolean b = m.matches();
		System.out.println(b);
	*/ 
		
		//Creating character set for range of characters between A to D and p to v
	/*	Pattern p = Pattern.compile("[A-Dp-v]");
		Matcher m = p.matcher("G");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set  for specific character
	/*	Pattern p = Pattern.compile("d[iu]g");
		Matcher m = p.matcher("dog");
		boolean b = m.matches();
		System.out.println(b);
	*/
	}
}
