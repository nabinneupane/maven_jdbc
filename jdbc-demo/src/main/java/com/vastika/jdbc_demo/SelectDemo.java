package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

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
	
	
	public static final String SQL = "select * from user_tbl"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Connection con = DBUtil.getConnection();
				Statement st = con.createStatement())
		{
			
			
			ResultSet rs  = st.executeQuery(SQL);
			
			while(rs.next())
			{
				System.out.println("id is: "+ rs.getInt("id"));
				System.out.println("user name is: " + rs.getString("user_name"));
				System.out.println("Password is: " + rs.getString("password"));
				System.out.println("=================================");
			}
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
