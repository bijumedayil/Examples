package com.cluster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cluster.util.DBUtil;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Account {
	

	public void transfer(int sacc,int dacc,int amt) 
	{
		int dabal,sabal,danbal,sanbal;
		Connection con = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		
		try
		{
			con = DBUtil.getConnection();
			// start Transaction
			con.setAutoCommit(false); // begin of transaction
			//op1 select
			pst1=con.prepareStatement("SELECT BAL FROM ACCOUNT WHERE ACCNO = ?");
			pst1.setInt(1,sacc);
			rs1  = pst1.executeQuery();
			if (rs1.next())
			{
				sabal=rs1.getInt("BAL");
			}
			else
			{
				throw new Exception();
			}

			if (sabal >= amt)
			{
				sanbal = sabal-amt;
			}
			else
			{
				throw new Exception();
			}
			
			//op2 update

			pst2=con.prepareStatement("UPDATE ACCOUNT SET BAL = ? WHERE ACCNO = ?");
			pst2.setInt(1,sanbal);
			pst2.setInt(2,sacc);
			pst2.executeUpdate();

			
			//op3 select
			pst1.setInt(1,dacc);
			rs2= pst1.executeQuery();
			if (rs2.next())
			{
				dabal=rs2.getInt("BAL");
			}
			else
			{
				throw new Exception();
			}
			danbal=dabal+amt;
			
			
			//op4 Update
			pst2.setInt(1,danbal);
			pst2.setInt(2,dacc);
			pst2.executeUpdate();
			con.commit(); // end of transaction
			System.out.println("Transfered money successfully....");
		}
		 
		catch (Exception e)
		{
			e.printStackTrace();
			try {
				System.out.println("Money not transferred succesfully....");
				con.rollback(); // end of transaction
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			} 
		}
		finally
		{
			try 
			{
				if(pst1!= null)
				{
					pst1.close();
				}
				
				if(pst2!= null)
				{
					pst2.close();
				}
				if(rs1!= null)
				{
					rs1.close();
				}
				if(rs2!= null)
				{
					rs2.close();
				}
			}
			catch(SQLException e)
			{
				System.out.println("Error in closing resources");
			}
		}
	}
}
