package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringDemo3 {
	public static void main(String[] args) {
		// using different methods of String class
		
		//subString()
		String s1 = "Apple";
		System.out.println("Value of s1 is " +s1);
		String subs1 = s1.substring(2,4);
		System.out.println("Value of string of s1 is " +s1);
		System.out.println("Value of sub string of s1 is " +subs1);
		System.out.println("Value of sub string of s1 is " +s1.substring(2));
		
		//trim()
	/*	String s2 = " ab  c ";
		System.out.println("Value of s2 is " + s2);
		//trim removes before and after spaces but not in the middle
		String trims2 = s2.trim();
		System.out.println("Value of trims2 after trim" + s2);
		System.out.println("Value of trims2" + trims2); */
				
		//split()
/*	 String s3 = "Hello guys how are you";
		String []as3 = s3.split("l");
		for (int i = 0; i < as3.length; i++) {
			System.out.println(as3[i]);
		}
*/		
		//replace() and repalceAll()
	/*	String s4 = "aaBBccDD";
		String rep1 = s4.replace('a','x');
		String rep2 = s4.replaceAll("c", "X");
		System.out.println("Value of s4 after replace "+s4);
		System.out.println("Value of rep1 "+rep1);
		System.out.println("Value of rep2 "+rep2);
	*/	
		//startsWith() and endsWith()
	/*	String s5 = "Cluster";
		System.out.println("s5 starts with " + s5.startsWith("clu"));
		System.out.println("s5 starts with " + s5.endsWith("ter"));
	*/	
		//intern()
	/*	String s6 ="World";
		String s7 = new String("World");
		if(s6==s7){
			System.out.println("s6 and s7 are equal before intern");
		}
		else{
			System.out.println("s6 and s7 are not equal before intern");
		}
		
		
		// intern() method provides the reference of the String inside the pool
		s7 = s7.intern();
		if(s6==s7){
			System.out.println("s6 and s7 are equal after intern");
		}
		else{
			System.out.println("s6 and s7 are not equal after intern");
		} */
		
		//valueOf()
			//valueOf() is used to convert primitives to String
	/*	String s8 = String.valueOf(99);
		boolean b = true;
		String s9 = String.valueOf(b);
		System.out.println("Sting Value of int is " + s8);
		System.out.println("String value of boolean is " + s9);*/
		
		/*	String s10 = "HelloWorld";
		System.out.println("Value of s10 is " + s10);
		System.out.println("length of the string is "+s10.length());
		System.out.println("Value of char at 2 index is "+ s10.charAt(5));
		System.out.println("Index of l is "+ s10.indexOf("l"));
		System.out.println("Index of l is "+ s10.lastIndexOf("l"));
		*/
	/*	s10 = s10.toLowerCase();
		System.out.println("Lower case "+ s10);
		s10 = s10.toUpperCase();
		System.out.println("Upper case "+ s10);
		*/
		//equalsIgnoreCase()
		//checks equality ignoring case
		/*String s11 = new String("hello");
		String s12 = new String("HELLo");
		System.out.println("checking equality ignoring case "+ s11.equalsIgnoreCase(s12));*/
		
	}
}
