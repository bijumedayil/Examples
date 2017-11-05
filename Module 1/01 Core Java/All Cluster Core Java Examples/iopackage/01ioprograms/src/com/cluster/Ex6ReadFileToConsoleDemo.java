package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to read a file and print to console using byte stream
public class Ex6ReadFileToConsoleDemo {

	public static void main(String[] args) {
		
		System.out.println("Begin main....");
		FileInputStream fin = null;
		int i = 0;
		
		// read() will read the file character by character till EOF is encountered
		try 
		{
			fin = new FileInputStream("D:/Eclipse_Examples/Aug_2013/ravikumar/javaexamples/corejava/iopackage/01ioprograms/src/hello.txt");
			do {
				i = fin.read();
				if (i != -1)
				{
					char c = (char)i;
					System.out.print(c);
				}
			} while (i != -1);
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Inside catch block of FileNotFoundException");
		}
		catch (IOException e) 
		{
			System.out.println("Inside catch block of IOException");
		}
		finally
		{
			try 
			{
				fin.close();
			}
			catch (IOException e) 
			{
				System.out.println("Inside catch block of IOException in finally block");
			}
			catch(NullPointerException e)
			{
				System.out.println("Inside catch block of NullPointerException in finally block");
			}
		}
		System.out.println("\nEnd main....");
	}
}
