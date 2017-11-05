package com.cluster;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.to.StudentTO;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		StudentTO sto1 = new StudentTO();
		sto1.setSid("101");
		sto1.setName("AAAA");
		sto1.setEmail("AA@CLUSTERINDIA.COM");
		sto1.setPhone("1111111");
		
		StudentTO sto2 = new StudentTO();
		sto2.setSid("102");
		sto2.setName("BBBB");
		sto2.setEmail("BB@CLUSTERINDIA.COM");
		sto2.setPhone("2222222");
		
		StudentTO sto3 = new StudentTO();
		sto3.setSid("103");
		sto3.setName("CCCC");
		sto3.setEmail("CC@CLUSTERINDIA.COM");
		sto3.setPhone("3333333");
		
		StudentTO sto4 = new StudentTO();
		sto4.setSid("104");
		sto4.setName("DDDD");
		sto4.setEmail("DD@CLUSTERINDIA.COM");
		sto4.setPhone("4444444");
		
		ArrayList arlStudents = new ArrayList();
		arlStudents.add(sto1);
		arlStudents.add(sto2);
		arlStudents.add(sto3);
		arlStudents.add(sto4);
		
		req.setAttribute("ARLSTUDENTS",arlStudents);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/hello.jsp");
		rd.forward(req, res);
		
	}
}
