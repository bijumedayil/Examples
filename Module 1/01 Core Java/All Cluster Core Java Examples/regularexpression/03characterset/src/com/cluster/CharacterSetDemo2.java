package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to show using quantifiers with character set
public class CharacterSetDemo2 {
	public static void main(String[] args) {
		
		//Creating character set for range of characters (only upper case letters)
	/*	Pattern p = Pattern.compile("[A-Z]+");
		Matcher m = p.matcher("AFG");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for range of characters (only lower case letters)
	/*	Pattern p = Pattern.compile("[a-z]*");
		Matcher m = p.matcher("prls");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for range of characters (both upper and lower case letters)
	/*	Pattern p = Pattern.compile("[A-Za-z]{4}");
		Matcher m = p.matcher("pqrs");
		boolean b = m.matches();
		System.out.println(b);
	*/
		
		//Creating character set for alpha numeric characters without underscore
	/*	Pattern p = Pattern.compile("[A-Za-z0-9]{3,8}");
		Matcher m = p.matcher("Afdf6");
		boolean b = m.matches();
		System.out.println(b);
	 */
		
		//Creating character set for range of characters between A to D and p to v
	/*	Pattern p = Pattern.compile("[A-Dp-v]+");
		Matcher m = p.matcher("pBrD");
		boolean b = m.matches();
		System.out.println(b);
	*/
	}
}
