package com.cluster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to read a file and write to console using character stream
public class Ex7ReadFileToConsoleDemo 
{
	//public static void main(String[] args) throws FileNotFoundException,IOException
	public static void main(String[] args) throws Exception
	{
		System.out.println("Begin main....");
		FileReader reader = null;
		int i = 0;
		reader = new FileReader("D:/Eclipse_Examples/Aug_2013/ravikumar/javaexamples/corejava/iopackage/01ioprograms/src/hello.txt");
		// read() will read the file character by character till EOF is encountered
		do 
		{
			i = reader.read();
			if(i != -1)
			{
				System.out.print((char) i);
			}
			
		} while (i != - 1);
		
		reader.close();
		System.out.println("\nBegin main....");

	}

}
