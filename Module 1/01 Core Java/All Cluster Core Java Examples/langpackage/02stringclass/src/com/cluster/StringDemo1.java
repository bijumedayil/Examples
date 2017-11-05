package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringDemo1 {
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = "Hai";
		String s4 = "Hai";
/*		
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
		System.out.println(s4.toString());
		*/
		if(s1==s2){
			System.out.println("s1 and s2 refer to the same object");
		}
		else{
			System.out.println("s1 and s2 refer to the different objects");
		}
		
		if(s3==s4){
			System.out.println("s3 and s4 refer to the same object");
		}
		else{
			System.out.println("s3 and s4 refer to the different objects");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1 and s2 have same values");
		}
		else{
			System.out.println("s1 and s2 have different values");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 and s4 have same values");
		}
		else{
			System.out.println("s3 and s4 have different values");
		}
		

	}

}
