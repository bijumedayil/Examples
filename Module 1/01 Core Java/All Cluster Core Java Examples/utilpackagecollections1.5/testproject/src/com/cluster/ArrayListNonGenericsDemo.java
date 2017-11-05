package com.cluster;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayListNonGenericsDemo {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
	//	list.add(10);
		list.add(new Integer(20));
		list.add(new Integer(50));
		list.add(new Integer(10));
		list.add(new Integer(30));
		list.add("AA");
		
		Object e = list.get(2);
		Integer i = (Integer)e;
		int x = i.intValue();
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object o = itr.next();
			Integer p = (Integer)o;
			int q = i.intValue();
			/*String s = (String)o;
			System.out.println(s);*/
		}
		
		System.out.println(list);

	}

}
