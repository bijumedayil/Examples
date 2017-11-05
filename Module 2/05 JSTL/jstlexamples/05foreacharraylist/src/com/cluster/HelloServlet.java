package com.cluster;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		ArrayList arl = new ArrayList();
		arl.add("RAVI");
		arl.add("KUMAR");
		arl.add("AMOGH");
		arl.add("VINAY");
		arl.add("RAJESH");
		req.setAttribute("ARL",arl);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/hello.jsp");
		rd.forward(req, res);
		
	/*	RequestDispatcher rd = req.getRequestDispatcher("./jsp/scripting.jsp");
		rd.forward(req, res);
	*/
	}
}
