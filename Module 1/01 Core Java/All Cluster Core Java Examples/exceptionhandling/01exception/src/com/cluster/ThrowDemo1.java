package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hai
{
	void m1(int x,int y)//throws ArithmeticException
	{
		if (x==0 && y==0)
		{
			//throw new ArithmeticException();
			System.out.println("Hello......");
		}
		else
		{
			int p=x/y;
			System.out.println("Value of p is" +p);
		}
	}
};


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ThrowDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin ... main");
		Hai h = null;
		try
		{
			h= new Hai();
			h.m1(10,0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Inside catchof main " + e);
			h.m1(10, 2);
		}
		System.out.println("End ... main");
	}
}
