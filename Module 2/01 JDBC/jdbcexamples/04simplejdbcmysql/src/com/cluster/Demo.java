package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mysql driver is loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ravimysql","root","cluster");
			System.out.println("got database connection");
			st = con.createStatement();
			st.execute("INSERT INTO EMP (EMP_ID,NAME,SALARY) VALUES(106,'KUMAR',6000);");
			st.execute("INSERT INTO EMP (EMP_ID,NAME,SALARY) VALUES(107,'RAMA',7000);");
			rs = st.executeQuery("SELECT * FROM EMP");
			while (rs.next())
			{
			int id = rs.getInt("EMP_ID");
			String name = rs.getString("NAME");
			int sal = rs.getInt("SALARY");
			System.out.println(id + "\t" + name +"\t" + sal);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception Caught: " + e);
		} catch (SQLException e) {
			System.out.println("Exception Caught: " + e);
		}
		
		finally
		{
			try {
				if(rs!= null)
				{
				rs.close();
				}
				if(st!=null)
				{
				st.close();
				}
				if(con!= null)
				{
				con.close();
				}
				
			} catch (SQLException se) {
				System.out.println("Inside catch of finally");
				// TODO: handle exception
			} 
			
		}

	}

}
