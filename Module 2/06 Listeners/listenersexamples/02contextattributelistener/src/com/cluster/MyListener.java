package com.cluster;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyListener implements ServletContextAttributeListener{
	
	public void attributeAdded(ServletContextAttributeEvent se) {
		ServletContext ctx = se.getServletContext();
		String s1 = (String) ctx.getAttribute("NAME");
		String s2 = (String) ctx.getAttribute("PHONE");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("attributeAdded");
		System.out.println("in attributeAdded method " + s1);
		System.out.println("in attributeAdded method " + s2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	public void attributeRemoved(ServletContextAttributeEvent se) {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("attributeRemoved");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	public void attributeReplaced(ServletContextAttributeEvent se) {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("attributeReplaced");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
}
