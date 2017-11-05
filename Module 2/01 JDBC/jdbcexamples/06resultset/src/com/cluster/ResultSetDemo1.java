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
public class ResultSetDemo1 {
	public static void main(String[] args) {
		
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravioracle","ravioracle"); 
			System.out.println("got database connection");
			st = con.createStatement();
			
		/*	//selecting all rows and all columns
			rs = st.executeQuery("SELECT * FROM EMP");
			System.out.println("Displaying all rows.......");
			while (rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY"));
			}
			System.out.println();
		*/
			
			//selecting only all name and salary 
		/*	rs = st.executeQuery("SELECT NAME, SALARY FROM EMP");
			System.out.println("Displaying only all name and salary rows.......");
			while (rs.next()){
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
			//	System.out.print(rs.getString(1)+"\t");
			//	System.out.println(rs.getInt(2)+"\t");

			}
			System.out.println();
		*/
			
			//selecting only all names 
		/*	rs = st.executeQuery("SELECT NAME FROM EMP");
			System.out.println("Displaying only all names .......");
			while (rs.next()){
				System.out.println(rs.getString("NAME")+"\t");
			//	System.out.print(rs.getString(1)+"\t");
			}
			System.out.println();
		*/	
			//selecting multiple rows by criteria 
		/*	rs = st.executeQuery("SELECT NAME, SALARY FROM EMP WHERE SALARY > 4000");
			System.out.println("Displaying only name and salary of employess whose salary is greater than 4000.......");
			while (rs.next()){
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
			//	System.out.print(rs.getString(1)+"\t");
			//	System.out.println(rs.getInt(2)+"\t");
			}
			System.out.println();
		*/
	/*			//selecting single row  
			rs = st.executeQuery("SELECT * FROM EMP WHERE EMP_ID=105");
			System.out.println("Displaying details of single row.......");
			if (rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY"));
			}
			System.out.println();
	*/		
			//selecting required columns in a single row  
	/*		rs = st.executeQuery("SELECT NAME, SALARY FROM EMP WHERE EMP_ID=105");
			System.out.println("Displaying details of single row only name and salary.......");
			if (rs.next()){
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY")+"\t");
			}
			System.out.println();
		*/
			//selecting only single value in a row  
			rs = st.executeQuery("SELECT NAME FROM EMP WHERE EMP_ID=105");
			System.out.println("Displaying details of single value in a row ......");
			if (rs.next()){
				System.out.println(rs.getString("NAME")+"\t");
			}
			System.out.println();
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
			cnfe.printStackTrace();
			
		}
		catch (SQLException sqle) {
			System.out.println(sqle);
			sqle.printStackTrace();
		}
		
		finally{
			try {
			if(rs != null){
				rs.close();
			}
			if(st != null){
				st.close();
			}
			if(con != null){
				con.close();
			}
			}
			catch(SQLException sqle)
			{
				System.out.println(sqle);
				sqle.printStackTrace();
				System.out.println("Error in closing resources");
			}
		}
	}
}
