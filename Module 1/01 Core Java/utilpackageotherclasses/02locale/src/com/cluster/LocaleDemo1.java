package com.cluster;

import java.util.Locale;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LocaleDemo1 {
	public static void main(String[] args) {

		// creating a US locale
	//	Locale locUS = Locale.US;
		Locale locUS = new Locale("en", "US");
		
		// creating a France locale
	//	Locale locFR = Locale.FRANCE;
		Locale locFR = new Locale("fr", "FR");
		
				
		// creating a India locale
		Locale locIN = new Locale("hi", "IN");
		
		System.out.println("Language code & Country Code: " + locUS);
		System.out.println("Language used: " + locUS.getDisplayLanguage());
		System.out.println("Country: " + locUS.getDisplayCountry());
		
		System.out.println("Language code & Country Code: " + locFR);
		System.out.println("Language used: " + locFR.getDisplayLanguage());
		System.out.println("Country: " + locFR.getDisplayCountry());
		
		System.out.println("Language code & Country Code: " + locIN);
		System.out.println("Language used: " + locIN.getDisplayLanguage());
		System.out.println("Country: " + locIN.getDisplayCountry());

	}
}
