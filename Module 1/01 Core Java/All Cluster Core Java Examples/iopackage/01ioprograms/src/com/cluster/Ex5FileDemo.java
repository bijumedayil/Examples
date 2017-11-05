package com.cluster;

import java.io.File;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// class File encapsulates information about a file
public class Ex5FileDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main....");
		File f1 = null;
		f1 = new File("D:/Eclipse_Examples/Aug_2013/ravikumar/javaexamples/corejava/iopackage/01ioprograms/src/hello.txt");
		System.out.println("The name of the file is... " + f1.getName());
		System.out.println("The absolute path of the file is... " + f1.getAbsolutePath());
		System.out.println("The file is readable... " + f1.canRead());
		System.out.println("The file is writeable... " + f1.canWrite());
		System.out.println("The file is present... " + f1.exists());
		System.out.println("The length of the file is... " + f1.length());
		System.out.println("Begin main....");
	}
}
