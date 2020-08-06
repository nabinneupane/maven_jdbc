package com.vastika.jdbc_demo.util;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class QueryUtil {

	
	public static final String  INSERT_SQL = "insert into user_tbl(user_name,password) values(?,?)";
	public static final String UPDATE_SQL = "Update user_tbl set user_name=?, password=? where id=?" ;
	
	public static final String LIST_SQL = "select * from user_tbl"; 
	public static final String DELETE_SQL = "delete from  user_tbl where id=?";
	
	public static final String GET_BY_ID_SQL = "select * from user_tbl where id=?"; 
	
}
