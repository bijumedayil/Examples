package com.cluster;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Box {
	 int w;
	 int h;
	 int d;
	 
	 static
	 {
		 System.out.println("Inside STATIC BLOCK");
	 }
	 
	 
	 {
		 System.out.println("Inside INSTANCE BLOCK");
	 }
	
	public Box()
	{
		System.out.println("Inside DEFAULT constructor");
	}
	
	public Box(int w, int h, int d) {
		System.out.println("Inside constructor");
		this.w = w;
		this.h = h;
		this.d = d;
	}

	public int volume()
	{
		int z ;
		z = w*h*d;
		return z;
	}

	public void show(){
		System.out.println("Value of w,h and d are " + w + "\t"+h +"\t" + d);
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ReflectionDemo2 {
	public static void main(String[] args) {
		try {
		//	Load any class
		//	Class c = Class.forName("com.cluster.Box");
			
		// create an instance after loading
		//	Box b = (Box)c.newInstance();
			
		// load Integer class
		//	Class c = Class.forName("java.lang.Integer");
			
			Class c = Integer.class;
		
			
			System.out.println("Constructors:");
			Constructor constructors[] = c.getConstructors(); // returns an array of all constructors
			for (int i = 0; i < constructors.length; i++) {
				System.out.println(" " + constructors[i]);
			}

			System.out.println("Fields:");
			Field fields[] = c.getFields(); // returns an array of all variables
			for (int i = 0; i < fields.length; i++) {
				System.out.println(" " + fields[i]);
			}

			System.out.println("Methods:"); // returns an array of all methods
			Method methods[] = c.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(" " + methods[i]);
			}
		}
		
		catch (Exception e) {
			System.out.println("Exception caught" + e);
		}  


	}

}
