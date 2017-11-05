package com.cluster;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DeSerializeDemo2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.ser"); // create a FileInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);// connect the ObjectInputStream to FileInputStream
			A a = (A) ois.readObject();// read the file and deserialize the object
			ois.close();// close the resource
			System.out.println("Value of deserialized object a is: " + a.x + "\t" + a.y + "\t" + a.z );
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
