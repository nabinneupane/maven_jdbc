package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class DBCreateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  sql = "Create database jdbc_demo_db"; 
		Connection con = null; 
		
		Statement st = null; 
		
		try {
			
			//1. Register the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. get connection object 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC","root","vastika1");
			
			//3. get statuement object 
			
			st = con.createStatement();
			
			
			
			//4. Execute query 
			
			st.executeUpdate(sql); 
			System.out.println("database created !!!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				
				//5. close the connection 
				con.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
