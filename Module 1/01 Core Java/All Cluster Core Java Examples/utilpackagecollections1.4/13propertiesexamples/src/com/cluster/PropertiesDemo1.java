package com.cluster;

import java.util.Properties;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PropertiesDemo1 {
	public static void main(String[] args) {

		// Create a Properties object
		Properties prop = new Properties();

		// Add key/value to the Properties
		// Properties stores keys in unordered way
		prop.put("Kumar", new Double(11.11));
		prop.put("Ravi", new Double(22.22));
		prop.put("Amogh", new Double(33.33));
		prop.put("Vinay", new Double(44.44));
		prop.put("Balaji", new Double(55.55));

		// can add different type of key in Properties
		prop.put(new Integer(10), new Double(99.99));

		// can add different type of value in Properties
		prop.put("Praveen", "PRAVEEN");

		// can add duplicate value in Properties
		prop.put("Sunil", new Double(44.44));

		// cannot add null key in Properties
	//	prop.put(null, new Double(66.66));

		// cannot add null value in Properties
	//	prop.put("Hello", null);

		System.out.println(prop);

	}

}
