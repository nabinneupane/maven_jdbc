package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class UpdateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try(Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL) )
		{
			ps.setString(1,"ghanshyam nepal");
			ps.setString(2, "ar");
			ps.setInt(3,5);
			ps.executeUpdate();
			
			System.out.println("Updaed from prepared statement");
			
		}catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
