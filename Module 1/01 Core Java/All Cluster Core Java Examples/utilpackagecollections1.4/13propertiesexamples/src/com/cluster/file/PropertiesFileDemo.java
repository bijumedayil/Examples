package com.cluster.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


// program to show class Properties can interact with file

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PropertiesFileDemo {
	public static void main(String[] args){
		
		try {
			FileInputStream fis = new FileInputStream("cluster.properties");
			Properties prop = new Properties();
			// load the properties from the file
			prop.load(fis);
			
			// print all values to console
		//	prop.list(System.out); 
			
			// get values by using key
		/*	String s = prop.getProperty("Karnataka");
			System.out.println("Value is: " + s);
		*/	
			
			// get all keys and iterate
		/*	Set set = prop.keySet(); // 1.2 method
			Iterator itr = set.iterator();
			while (itr.hasNext())
			{
				String s = itr.next().toString();
				System.out.println("Value of key is: " + s);
			}
		*/

			// get all the keys and iterate using Enumeration
		/*	Enumeration e = prop.propertyNames(); // 1.0  method
			while(e.hasMoreElements())
			{
				String s = e.nextElement().toString();
				System.out.println("Value of state is: " + s);
			}
		*/
			
			// store both key and value to another file
		/*	FileOutputStream fos = new FileOutputStream("hello.properties");
			prop.store(fos, "My New File");
			System.out.println("Finished storing");
		*/
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
