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
public class UpdatableResultSetDemo {
	public static void main(String[] args) {
		
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravioracle","ravioracle"); 
			System.out.println("got database connection");
			
	//		System.out.println(ResultSet.TYPE_SCROLL_SENSITIVE);
	//		System.out.println(ResultSet.CONCUR_UPDATABLE);
			
			
			//getting a updatable resultset
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("SELECT EMP_ID, NAME, SALARY FROM EMP");
			
			//before updating
			System.out.println("Before updating.......");
			while(rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getInt("SALARY"));
			}
			
			//updating 5th record
			rs.absolute(5);
			rs.updateString(2, "AAAA");
			rs.updateInt("SALARY", 5555);
			rs.updateRow();

			//deleting 7th record
			rs.absolute(7);
			rs.deleteRow();
			
			//inserting a record
			rs.moveToInsertRow();
			rs.updateInt(1, 109);
			rs.updateString("NAME","VINAY");
			rs.updateInt("SALARY", 9999);
			rs.insertRow();
			
						
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
