package com.cluster;

//program with generics

// Hello is a generics class because it is having type parameter
/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello<T>
{
	T ob;
	
	void m1(T t)
	{
		ob = t;
	}
	
	T m2()
	{
		return ob;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class GenericsDemo2 {
	public static void main(String[] args) {
		
		Hello<String> h1 = null; // declaring a generic reference variable 
		h1 = new Hello<String>();  
		
		// h1 can use only String because type argument is of String type
		h1.m1("Cluster");
	//	h1.m1(new Integer(10)); 
		
		// no type casting required
		String s = h1.m2();
		System.out.println("Value of s is: " + s);


		Hello<Integer> h2 = new Hello<Integer>();
		// h2 can use only Integer because type argument is of Integer type
		h2.m1(new Integer(10));
	//	h2.m1("Cluster");
		
		// no type casting and unboxing required
		int i = h2.m2();
		System.out.println("Value of i is: " + i);

		
		// using raw type without generics (no need of specifying type argument)
		// raw type does not check for type safety
		Hello h3 = new Hello();
	//	h.m1(new Integer(10));
		h3.m1("Cluster");
		// type casting is required 
		String s1 = (String)h3.m2();
		System.out.println("Value of s1 is: " + s1);

	}
}
