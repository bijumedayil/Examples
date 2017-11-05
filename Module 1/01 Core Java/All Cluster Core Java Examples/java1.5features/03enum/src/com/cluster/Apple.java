package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public enum Apple {
	JONATHAN(10,"England"), GOLDENDEL(9,"Ireland"), REDEL(12,"India"), WINESAP(15,"Finland"), CORTLAND(8,"Germany");

	 int price; // instance variable
	 String country;
	 static String color = "Red"; //static variable
	
	 // static block
	static 
	{
		System.out.println("Inside static block");
	}
	
	// instance bock
	{
		System.out.println("Inside instance block");
	}
	
	//Constructor
	private Apple(int p,String c) {
		System.out.println("Inside constructor");
		price = p;
		country = c;
	}
	
	//instance method
	public int getPrice() { 
		return price;
	}
	public String getCountry() { 
		return country;
	}
	
	// static method
	public static String getColor(){ 
		return color;
	}
	
	// can override toString() method
	public String toString(){ 
		return country + "\t" + price ;
	}
}
