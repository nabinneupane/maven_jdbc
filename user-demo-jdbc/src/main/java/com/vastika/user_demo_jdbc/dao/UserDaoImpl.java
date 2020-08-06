package com.vastika.user_demo_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.user_demo_jdbc.Util.DBUtil;
import com.vastika.user_demo_jdbc.Util.QueryUtil;
import com.vastika.user_demo_jdbc.model.User;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class UserDaoImpl implements UserDao {

	@Override
	public int saveUserInfo(User user) {
		// TODO Auto-generated method stub
		
		int saved =0;
		try(
				Connection con = DBUtil.getConnection(); 
				PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL)
			)
		{
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setLong(3,  user.getMobileNo());
			ps.setString(4, user.getAddress());
			
			saved = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saved;
	}

	@Override
	public int updateUserInfo(User user) {
		// TODO Auto-generated method stub
		int updated =0;
		try(
				Connection con = DBUtil.getConnection(); 
				PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL)
			)
		{
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setLong(3,  user.getMobileNo());
			ps.setString(4, user.getAddress());
			ps.setInt( 5, user.getId());
			updated = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updated;
	}

	@Override
	public void deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		
		try(
				Connection con = DBUtil.getConnection(); 
				PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL)
			)
		{
			
		ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public User getUserById(int id) {
		
		User user = new User(); 
		try(
				Connection con = DBUtil.getConnection(); 
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL)
			)
		{
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				user.setAddress(rs.getString("address"));
				user.setMobileNo(rs.getLong("mobile_no"));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> getAllUserInfo() {
		
		
		List<User> userList = new ArrayList<User>(); 
		
		
		
		try(
				Connection con = DBUtil.getConnection(); 
				PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL)
			)
		{
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				user.setAddress(rs.getString("address"));
				user.setMobileNo(rs.getLong("mobile_no"));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userList;
		
	}

}