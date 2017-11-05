package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DeserializeDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");// create a FileInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);// connect ObjectInputStream to FileInputStream 
			A a = (A)ois.readObject();// deserialize and read from file
			System.out.println("Values in deserialized object a is: "+ a.x +"\t"+ a.y+"\t"+a.z);
			ois.close();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}

	}

}
