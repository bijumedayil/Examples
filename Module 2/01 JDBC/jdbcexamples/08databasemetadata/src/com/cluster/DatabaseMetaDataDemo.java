package com.cluster;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DatabaseMetaDataDemo {
	public static void main(String[] args) {
		
		Connection con =null;
		try {
			
			// Oracle connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravioracle","ravioracle"); 
			
		/*	// MySQL connection
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ravimysql","root","cluster"); 
		*/	
			
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Database Minor version : " + dbmd.getDriverMinorVersion());
			System.out.println("Database Major version : " + dbmd.getDriverMajorVersion());
			System.out.println("Database product name : " + dbmd.getDatabaseProductName());
			System.out.println("Database product version : " + dbmd.getDatabaseProductVersion());
			System.out.println("Database supports transactions : " + dbmd.supportsTransactions());
			System.out.println("Database supports multiple transactions : " + dbmd.supportsMultipleTransactions());
			System.out.println("Database supports outer joins : " + dbmd.supportsOuterJoins());
			System.out.println("Database supports stored procedures : " + dbmd.supportsStoredProcedures());
			System.out.println("Database supports batch updates : " + dbmd.supportsBatchUpdates());
			
						
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
