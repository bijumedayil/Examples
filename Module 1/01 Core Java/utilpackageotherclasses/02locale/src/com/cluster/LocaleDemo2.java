package com.cluster;

import java.util.Locale;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LocaleDemo2 {

	public static void main(String[] args) {

		// get  all locales
	//	Locale[] loc = Locale.getAvailableLocales();
		
		// get all ISO standard 2 letter country code 
	//	String[] loc = Locale.getISOCountries();
		
		// get all ISO standard 2 letter language code
	 String[] loc = Locale.getISOLanguages();

		int i = 0;
		while (i < loc.length) {
			System.out.println( loc[i]);
			i++;
		}

	}

}
