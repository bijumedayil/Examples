package com.cluster;

import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to copy from one file to another file
public class Ex8CopyFileDemo 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Begin Main ....");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int i = 0;
		
		// open a input stream
		fin = new FileInputStream("D:/Eclipse_Examples/Aug_2013/ravikumar/javaexamples/corejava/iopackage/01ioprograms/src/hello.txt");
		
		// open a output stream
		fout = new FileOutputStream("D:/Eclipse_Examples/Aug_2013/ravikumar/javaexamples/corejava/iopackage/01ioprograms/src/cluster.txt");
		
		// copy the file
		do {
			i = fin.read();
			if (i != -1)
			{
				fout.write(i);
			}
		} while (i != -1);
		
		fin.close();
		fout.close();
		
		System.out.println("Finished copying file");
		System.out.println("End Main ....");

	}

}
