package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class SelectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL) )
		{
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next())
			{
				System.out.println("id is: " + rs.getInt("id") + " name is: " + rs.getString("user_name") + " password is: " + rs.getString("password"));
				System.out.println("=================");
			}
			System.out.println("Se from prepared statement");
			
		}catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
