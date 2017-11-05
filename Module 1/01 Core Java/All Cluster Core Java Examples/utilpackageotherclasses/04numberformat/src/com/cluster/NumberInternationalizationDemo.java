package com.cluster;

import java.text.NumberFormat;
import java.util.Locale;



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// i18n with number
// use NumberFormat class
public class NumberInternationalizationDemo {
		
		static void printNumber(Locale locale){   
			 double dbl=123456.78;   
			 NumberFormat formatter=NumberFormat.getNumberInstance(locale);   
			 String number=formatter.format(dbl);   
			 System.out.println(number+" for the locale "+locale);   
			}   
			  
			public static void main(String[] args) {   
				printNumber(new Locale("kn", "IN"));
			    printNumber(Locale.UK);   
			    printNumber(Locale.US);   
			    printNumber(Locale.JAPAN);   
			    printNumber(Locale.FRANCE);   
			}   
}
