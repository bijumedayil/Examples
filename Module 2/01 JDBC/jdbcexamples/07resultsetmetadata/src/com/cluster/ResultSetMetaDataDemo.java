package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ResultSetMetaDataDemo {
	public static void main(String[] args) {
		
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravioracle","ravioracle"); 
			st = con.createStatement();
			
			//selecting all rows and all columns
			rs = st.executeQuery("SELECT * FROM EMP");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("total number of columns: " + rsmd.getColumnCount());
			System.out.println("name of column: " + rsmd.getColumnName(1));
			System.out.println("data type of column: " + rsmd.getColumnTypeName(1));
						
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
