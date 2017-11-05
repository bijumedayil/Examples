package com.cluster;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A implements Serializable
{
	int x;
	int y;
	int z;
	
	public A(int x, int y, int z) {
		System.out.println("Inside constructor");
		this.x = x;
		this.y = y;
		this.z = z;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializeDemo {
	public static void main(String[] args) {
		A a = new A(10,20,30);
		System.out.println("Values in object a is: "+ a.x +"\t"+ a.y+"\t"+a.z);
		try {
			FileOutputStream fos = new FileOutputStream("abc.txt"); // create a FileOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);// connect the ObjectOutputStream to FileOutputStream
			oos.writeObject(a); // serialize and write to file
			oos.close(); // closing the resource
			System.out.println("Serialization Done!!!!");
		} catch (Exception e) {
			System.out.println("Exception Caught: " + e);
		}
	}

}
