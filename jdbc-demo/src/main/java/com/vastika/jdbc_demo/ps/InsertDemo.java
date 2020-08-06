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
public class InsertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection con = DBUtil.getConnection(); 
		PreparedStatement ps= con.prepareStatement(QueryUtil.INSERT_SQL))
		{
			ps.setString(1, "Shyam Nepal");
			ps.setString(2, "shyampassword");
			ps.executeUpdate();
			System.out.println("Data Inserted");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
