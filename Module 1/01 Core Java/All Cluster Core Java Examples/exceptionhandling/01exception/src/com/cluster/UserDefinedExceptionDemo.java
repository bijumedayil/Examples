package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class StudentNotFoundException extends Exception
{
	String msg;
	
	StudentNotFoundException(int sid)
	{
		msg = "Student ID no " + sid + "is not valid";
	}

	public String toString()  //overriding class Object
	{
		return msg;
	}

}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Student
{
	void checkStudent(int id)throws StudentNotFoundException
	{
		if (id < 50)
		{
			System.out.println("Student id no " + id + "is valid" );
		}
		else
		{
			throw new StudentNotFoundException(id);
		}

	}
};


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		try
		{
			Student s = new Student();
			s.checkStudent(76);
			
		}
		catch (StudentNotFoundException e)
		{
			System.out.println("Inside catch " + e);
		//	e.printStackTrace();
		}

	}

}
