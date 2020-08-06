package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class TableCreateDemo {

	
	public static final String DRIVER_NAME ="com.mysql.jdbc.Driver";
	public static final String URL ="jdbc:mysql://localhost:3306/jdbc_demo_db?serverTimezone=UTC";
	
	public static final String USER_NAME="root";
	public static final String  PASSWORD="vastika1"; 
	public static final String SQL ="Create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(50), primary key(id))";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Connection  con = DBUtil.getConnection();
				Statement st = con.createStatement(); 
				 ){
			st.executeUpdate(SQL);
			System.out.println("Table created");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
