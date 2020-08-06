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
public class DeleteDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL) )
		{
			ps.setInt(1,1);
			ps.executeUpdate();
			
			System.out.println("Data deleted");
			
		}catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
