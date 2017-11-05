package com.cluster.sort.employee.comparator;

import java.util.Comparator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class EmployeeEmailComparator implements Comparator{
	
	public int compare(Object object1, Object object2) 
	{
		if (!((object1 instanceof Employee)&& (object2 instanceof Employee))) 
		{
			throw new ClassCastException();
		} 
		else 
		{
			Employee emp1 = (Employee)object1;
			Employee emp2 = (Employee)object2;
			String s1 = emp1.getEmail();
			String s2 = emp2.getEmail();
			
			
			// compare first object with second object to sort in ascending order
			return s1.compareTo(s2);
			
			
		/*	// compare second object with first object to sort in descending order
			return s2.compareTo(s1);
		*/	
		}
	}

}
