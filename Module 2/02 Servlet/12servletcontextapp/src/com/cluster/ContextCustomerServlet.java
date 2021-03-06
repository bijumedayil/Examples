package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
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
public class ContextCustomerServlet extends HttpServlet{
	
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("############Inside init() method");
		
		ServletContext ctx = config.getServletContext();
		
		String strDriver = ctx.getInitParameter("driver");
		String strUrl = ctx.getInitParameter("dburl");
		String strUserId = ctx.getInitParameter("dbuid");
		String strPassword = ctx.getInitParameter("dbpwd");
		System.out.println("Value of strDriver is ******* " + strDriver);
		System.out.println("Value of strUrl is ******* " + strUrl);
		System.out.println("Value of strUserId is ******* " + strUserId);
		System.out.println("Value of strPassword is ******* " + strPassword);
		
		try {
			Class.forName(strDriver);
			con = DriverManager.getConnection(strUrl, strUserId,strPassword);
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println("############Inside doPost() method");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String strNme = req.getParameter("nme");
		String strPwd = req.getParameter("pwd");
		String strEmail = req.getParameter("email");
		String strPhone = req.getParameter("phone");
		
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement("INSERT INTO CUSTOMER(NAME,PASSWORD,EMAIL,PHONE) VALUES (?,?,?,?)");
			pst.setString(1, strNme);
			pst.setString(2, strPwd);
			pst.setString(3, strEmail);
			pst.setString(4, strPhone);
			
			int i = pst.executeUpdate();
			
			if (i==1)
			{
				pw.println("<html>");
				pw.println("<body bgcolor='green'>");
				pw.println("Hello Mr " + strNme + " Thank you for becoming a member");
				pw.println("</body>");
				pw.println("</html>");
			}
			
			else
			{
				pw.println("<html>");
				pw.println("<body bgcolor='red'>");
				pw.println("Hello Mr " + strNme + " Better luck next time");
				pw.println("</body>");
				pw.println("</html>");
			}
			
		}  catch (SQLException e) {
			System.out.println("Exception caught " + e);
			e.printStackTrace();
		}
		
		finally{
			try {
				
				if(pst!=null)
				{
				pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void destroy() {
		System.out.println("############Inside destroy() method");
		try {
			con.close();
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}
}
