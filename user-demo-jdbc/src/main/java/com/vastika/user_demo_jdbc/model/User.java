package com.vastika.user_demo_jdbc.model;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 4, 2020 
 **/
public class User {

		private String username;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		private int id;
		private String password; 
		private String address;
		private long mobileNo;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}


}
