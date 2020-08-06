package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class DeleteDemo {

	
	public static final String SQL = "delete from  user_tbl where id='3'";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();)
		{
			st.executeUpdate(SQL);
			
			System.out.println("Deleted ");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
