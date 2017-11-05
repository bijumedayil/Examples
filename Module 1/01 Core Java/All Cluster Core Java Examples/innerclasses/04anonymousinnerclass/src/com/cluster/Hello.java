package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Hello
{
	 A a = new A(){ // initialize the instance variable by creating the object and overriding the method
		public void m1()
		{
			System.out.println("Inside Hello A m1");
			
		}
	};
	
	B b = new B(){
		void m2()
		{
			System.out.println("Inside Hello B m2");
		}
	};
	
	C c = new C(){
		void m3()
		{
			System.out.println("Inside Hello C m3");
		}
	};
	
	void show()
	{
		// can use the overridden method of anonymous class in same class
		a.m1(); 
		b.m2();
		c.m3();
	}
}
