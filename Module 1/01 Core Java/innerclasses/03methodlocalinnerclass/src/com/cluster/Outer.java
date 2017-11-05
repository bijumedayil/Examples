package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Outer
{
	int a = 10;
	
	void m1()
	{
		//Inner i = new Inner(); method local inner class cannot be used in another method
		System.out.println("inside m1");
	}
	
	void m2()
	{
		System.out.println("Inside m2");

		//Inner i = new Inner(); cannot be used before class definition
		class Inner
		{
			int b = 20;
			void show()
			{
				System.out.println("inside show of Inner");
				System.out.println("val of a in show of Inner" + a); //method local inner class can access outer class member directly
				System.out.println("val of b in show of Inner" + b);
			}
		}
		Inner i = new Inner(); // method local inner can be used only in the same method only after class definition
		i.show();
	}
	
}

