package com.cluster;

import java.lang.reflect.Field;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello {
	String fname = "rahul";
	private String lname = "dravid";
	private int age = 32;
}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ReflectionDemo4 {
	public static void main(String[] args) {
		Hello h = new Hello();
		Field[] fields = h.getClass().getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			System.out.println("Field " + i + " - " + fields[i]);
			if (fields[i].getType().equals(String.class)) {
				fields[i].setAccessible(true);
				try {
					Field field = fields[i];
					System.out.println("Original Data :" + field.get(h));
					String s = (String) field.get(h);
					fields[i].set(h, s.toUpperCase());
					System.out.println("Changed Data :" + field.get(h));
				} 
				catch (Exception e) {
				}
			}
		}
				System.out.println(h.fname);
	}
}
