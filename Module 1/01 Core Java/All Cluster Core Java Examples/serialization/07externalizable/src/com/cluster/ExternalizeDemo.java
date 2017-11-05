package com.cluster;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Test 
{
	int p;
	int q;

	Test(int i, int j) {
		p = i;
		q = j;
	}

}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A implements Externalizable {
	int x ;
	int y ; 
	Test t ;

	public A() {
		System.out.println("Inside A contructor");
	}
	
	public A(int x,int y, Test t)
	{
		this.x = x;
		this.y = y;
		this.t = t;
		
	}
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("Using writeExternal()....... method during serialization");
		out.writeInt(x);
		out.writeInt(y);
		out.writeInt(t.p);
		out.writeInt(t.q);
	}
	public void readExternal(ObjectInput in) throws IOException
	{
		System.out.println("Using readExternal()....... method during deserialization");
		// values should be read in the same order as written in writeExternal() method
		x = in.readInt();
		y = in.readInt();
		int m = in.readInt();
		int n = in.readInt();
		t = new Test(m,n);
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ExternalizeDemo {
	public static void main(String[] args) {
	try {
		Test t = new Test(5,5);
		A a = new A(10, 20, t);
		FileOutputStream fos = new FileOutputStream("hello.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(a);
		oos.close(); 

		FileInputStream fis = new FileInputStream("hello.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("Creating deserialized object");
		A a1 = (A) ois.readObject();
		ois.close(); 
		System.out.println("Value of object a is: " + a.x + "\t" + a.y +"\t" + a.t.p +"\t" + a.t.q + "\t" + a);
		System.out.println("Value of object a1 is: " + a1.x + "\t" + a1.y); 
		System.out.println( "Value of test object in a1 is: " + a1.t.p +"\t" + a1.t.q + "\t" + a1);

		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
