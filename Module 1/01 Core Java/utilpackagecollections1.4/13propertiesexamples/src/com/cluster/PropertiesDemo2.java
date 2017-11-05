package com.cluster;

import java.util.Properties;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		// Create a Properties
		Properties prop = new Properties();
		System.out.println("Properties is empty before adding vales: "+ prop.isEmpty() );
		System.out.println("Size of Properties before adding values: "+ prop.size() );
		
		// Add key/value to the Properties
		prop.put("Kumar", new Double(11.11));
		prop.put("Ravi", new Double(22.22));
		prop.put("Amogh", new Double(33.33));
		prop.put("Vinay", new Double(44.44));
		prop.put("Balaji", new Double(55.55));
		
		System.out.println("Properties is empty after adding values: "+ prop.isEmpty() );
		System.out.println("Size of Properties after adding values: "+ prop.size() );

		// using same key will update or replace the value 
		prop.put("Ravi", new Double(99.99));
		System.out.println(prop);
		
		// getting a value using a key
		Object e1 = prop.get("Ravi");
		System.out.println("Value of Ravi is: " + e1);
		
		Object e2 = prop.get("Tom");
		System.out.println("Value of Tom is: " + e2);
		
		//deleting
		prop.remove("Vinay");
		System.out.println("Values in Properties after deleting: " + prop);
		
		boolean b = prop.containsKey("Ravi"); // 1.2 method
		boolean b1 = prop.contains("Rama"); // 1.0 method
		System.out.println("Key Ravi is present: " +b);
		System.out.println("Key Rama is present: " + b1);

		System.out.println(prop.containsValue("33.33"));
		System.out.println(prop.containsValue(new Double(33.33)));
		
		prop.clear();
		System.out.println("Values in Properties after clearing: " + prop);
		
	}
}
