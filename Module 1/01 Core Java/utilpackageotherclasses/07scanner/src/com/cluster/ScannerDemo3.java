package com.cluster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ScannerDemo3 {

	public static void main(String[] args) {
		
		try {
			FileReader fin =  new FileReader("numbers.txt");
			Scanner sc = new Scanner(fin);
			System.out.println("Reading and printing values from file: ");
			while(sc.hasNext())
			{
				double d = sc.nextDouble();
				System.out.println(d);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
