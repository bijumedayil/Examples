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
public class ExecuteDemo2 {
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
			
			//using execute() method to insert,update or delete only one record
			boolean a = st.execute("INSERT INTO EMP (EMP_ID, NAME,SALARY) VALUES(108,'JEEVAN',8000)");
			boolean b = st.execute("UPDATE EMP SET SALARY=3333 WHERE NAME = 'GANESH'");
			boolean c = st.execute("DELETE EMP WHERE EMP_ID=104");
			System.out.println("Value of a for inserting one row is " +a);
			System.out.println("Value of b for updating one row is " +b);
			System.out.println("Value of c for deleting one row is " +c);
			
			//using execute() method to update or delete multiple records
			boolean p = st.execute("UPDATE EMP SET SALARY=9999 WHERE EMP_ID > 106");
			boolean q = st.execute("DELETE EMP WHERE EMP_ID < 104");
			System.out.println("Value of p for updating multiple rows " +p);
			System.out.println("Value of q for deleting multiple rows " +q);
			
			
			//using select query with execute() method will always return true
			boolean z = st.execute("SELECT * FROM EMP");
			System.out.println("Value of z for selecting rows " +z);
			 
			if(z){
				 rs = st.getResultSet();
			}
			while (rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getString("SALARY"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
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
			catch(SQLException e)
			{
				System.out.println("Error in closing resources: " + e);
				e.printStackTrace();
			}
		}
	}

}
