package com.cluster;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("*****************************");
		System.out.println("Servlet Context Initialized");
		System.out.println("*****************************");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("*****************************");
		System.out.println("Servlet Context Destroyed");
		System.out.println("*****************************");
	}
}
