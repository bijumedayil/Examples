package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();
		ctx.removeAttribute("NAME");
		ctx.removeAttribute("PHONE");

		RequestDispatcher rd = req.getRequestDispatcher("/jsp/b.jsp");
		rd.forward(req, res);
	}
}
