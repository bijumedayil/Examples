package com.cluster;

import java.text.NumberFormat;
import java.util.Locale;



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// i18 with currency
// use NumberFormat class
public class CurrencyInternationalizationDemo {
	
	static void printCurrency(Locale locale){
		 double dbl=10500.32;
		 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
		 String currency=formatter.format(dbl);
		 System.out.println(currency+" for the locale "+locale);
		}

		public static void main(String[] args) {
			printCurrency(new Locale("kn", "IN"));
			printCurrency(Locale.UK);
			printCurrency(Locale.US);
		//	printCurrency(Locale.FRANCE);
			printCurrency(new Locale("fr","FR"));
			
		}

}
