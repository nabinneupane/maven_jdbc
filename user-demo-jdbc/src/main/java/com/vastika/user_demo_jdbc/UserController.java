package com.vastika.user_demo_jdbc;

import java.util.List;
import java.util.Scanner;

import com.vastika.user_demo_jdbc.model.User;
import com.vastika.user_demo_jdbc.service.UserService;
import com.vastika.user_demo_jdbc.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class UserController 
{
    public static void main( String[] args )
    {
       
    	UserService  userServices = new UserServiceImpl(); 
    	
    	Scanner reader = new Scanner(System.in);
    	
    	String decision = "";
    	
    	
    	do {
    		
    		System.out.println("What operation do you want to perform? save|update|delete|get|list");
    	String choice = reader.next(); 
    	
    	
    	
    	switch(choice)
    	{
    	case "save":
    		
    		User saveUser = getUserData(choice,reader);
        	
        	int saved = userServices.saveUserInfo(saveUser); 
        	
        	if(saved >=1 )
        	{
        		System.out.println("user info is saved sucessfully");
        	}
        	else
        	{
        		System.out.println("Error in db.");
        	}
        	
    		break;
    		
    	case "update":
    		
    		User updateUser = getUserData(choice, reader);
    		
    		int updated = userServices.saveUserInfo(updateUser); 
        	
        	if(updated >=1 )
        	{
        		System.out.println("user info is updated sucessfully");
        	}
        	else
        	{
        		System.out.println("Error in db.");
        	}
    		break;
    		
    	case "delete":
    		
    		System.out.print("\nEnter the id: ");
    		int deleteId = reader.nextInt(); 
    		userServices.deleteUserInfo(deleteId);
    		
    		System.out.println("User info is deleted");
    		break;
    		
    	case "get":
    		
    		System.out.print("\nEnter the id: ");
    		int getId = reader.nextInt(); 
    		
    		User user = userServices.getUserById(getId); 
    		 System.out.println("User id is: " + user.getId());
    		 System.out.println("User name is: " + user.getUsername());
    		 System.out.println("User address is: " + user.getAddress());
    		 System.out.println("User mobile number is: " + user.getMobileNo());
    		 
    		break;
    		
    	case "list":
    		
    		List<User> userList = userServices.getAllUserInfo(); 
    		
    		
    		for (User u: userList)
    		{
    			System.out.println("User id is: " + u.getId());
       		 System.out.println("User name is: " + u.getUsername());
       		 System.out.println("User address is: " + u.getAddress());
       		 System.out.println("User mobile number is: " + u.getMobileNo());
       		 
    		}
    		break;
    	default: 
    		System.out.println("Wrong Choice");
    	}
    	System.out.println("DO you want to perform next operation? press y /y for yes");
    	decision= reader.next();
    	}while(decision.equalsIgnoreCase("y"));
    }
    
    public static User getUserData(String type, Scanner reader)
    {
    	User user = new User();
    	
    	if(type.equals("update"))
    	{
    		System.out.println("Enter id: ");
    		int id =reader.nextInt();
    		user.setId(id);
    	}
    	System.out.println("Enter your name: ");
    	String userName = reader.next();
    	
    	
    	System.out.println("Enter your password: ");
    	String password = reader.next();
    	
    	System.out.println("Enter your mobile no: ");
    	long mobileNo = reader.nextLong();
    	
    	System.out.println("Enter your address: ");
    	String address = reader.next();
    	
    	
    	user.setUsername(userName);
    	user.setAddress(address);
    	user.setMobileNo(mobileNo);
    	user.setPassword(password);
    	
    	return user;
    	
    }
}
