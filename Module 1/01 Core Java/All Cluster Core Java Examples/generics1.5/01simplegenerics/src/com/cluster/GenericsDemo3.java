package com.cluster;

//Sample is a generics class and it is having two type parameter
/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Sample<T,V>
{
	T ob1;
	V ob2;
	
	public Sample(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	public T getOb1() {
		return ob1;
	}
	
	public V getOb2() {
		return ob2;
	}
}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class GenericsDemo3 {
	public static void main(String[] args) {
		
		Sample<String, String> s1 = new Sample<String, String>("Hello", "World");
		String a = s1.getOb1();
		String b = s1.getOb2();
		System.out.println("value of a & b is : " + a + "\t" + b);
		
		Sample<Integer,	Integer> s2 = new Sample<Integer, Integer>(10, 20);
		int x = s2.getOb1();
		int y = s2.getOb2();
		System.out.println("value of x & y is : " + x + "\t" +  y);
		
		Sample<Integer, String> s3 = new Sample<Integer, String>(10, "Cluster");
		int p = s3.getOb1();
		String q = s3.getOb2();
		System.out.println("value of p & q : " + p + "\t" + q);
		
	}
}
