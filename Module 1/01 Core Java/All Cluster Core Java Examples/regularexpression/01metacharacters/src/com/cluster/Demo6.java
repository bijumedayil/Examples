package com.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo6 {
	public static void main(String[] args) {
		
			//Matches any non digit. (Negation of \d )
		/*	Pattern p = Pattern.compile("\\D");
			Matcher m = p.matcher("A");
			boolean b = m.matches();
			System.out.println(b);
		*/
						
			//(Negation of \w )
		/*	Pattern p = Pattern.compile("\\W");
			Matcher m = p.matcher("@");
			boolean b = m.matches();
			System.out.println(b);
		*/
						
			//Matches any non white space character (Negation of \w)
		/*	Pattern p = Pattern.compile("\\S");
			Matcher m = p.matcher("A");
			boolean b = m.matches();
			System.out.println(b);
		*/

	}

}
