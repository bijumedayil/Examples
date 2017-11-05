package com.cluster;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// i18n with messages
public class InternationalizationDemo {

	public static void main(String[] args) {

		// Load resource bundle for Locale.US locale. The resource bundle will
		// load the MyMessage_en_US.properties file and get the value from the file by using the keys.

		ResourceBundle bundle = ResourceBundle.getBundle("com/cluster/MyMessage", Locale.US);
		System.out.println("Message in " + Locale.US + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));

		// Change the locale to France and get the resource bundle for the current locale.
		Locale.setDefault(new Locale("fr", "FR"));
		System.out.println("");
		bundle = ResourceBundle.getBundle("com/cluster/MyMessage");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));
		
		// Change the locale to India and get the resource bundle for the current locale.
		Locale.setDefault(new Locale("hi", "IN"));
		System.out.println("");
		bundle = ResourceBundle.getBundle("com/cluster/MyMessage");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));
		
		// Change the locale to India and display in Kannada language.
		Locale.setDefault(new Locale("kn", "IN"));
		System.out.println("");
		bundle = ResourceBundle.getBundle("com/cluster/MyMessage");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));
		
		// Change the locale to India and display in Tamil language.
		// since it does not find the matching properties file it will load from the default bundle
		//default bundle is a file which has only file name and does not have any extension
		Locale.setDefault(new Locale("ta", "IN"));
		System.out.println("");
		bundle = ResourceBundle.getBundle("com/cluster/MyMessage");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));
		
		// Change the locale to Germany and get the resource bundle for the current locale.
		Locale.setDefault(new Locale("de", "DE"));
		System.out.println("");
		bundle = ResourceBundle.getBundle("com/cluster/MyMessage");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting") + " "+ bundle.getString("enquiry"));
		
	}
}












