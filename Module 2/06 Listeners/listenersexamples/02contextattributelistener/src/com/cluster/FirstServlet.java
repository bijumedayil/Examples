package com.cluster;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();

		String strNme = req.getParameter("nme");
		String strPh = req.getParameter("ph");

		ctx.setAttribute("NAME", strNme);
		ctx.setAttribute("PHONE", strPh);

		RequestDispatcher rd = req.getRequestDispatcher("/jsp/a.jsp");
		rd.forward(req, res);

	}
}
