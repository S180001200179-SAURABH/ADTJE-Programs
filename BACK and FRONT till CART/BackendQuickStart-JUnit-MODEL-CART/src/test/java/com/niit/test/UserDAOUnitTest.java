package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserDAOUnitTest 
{

	static UserDAO userDAO;
	//static User user;
	//_____________________________________________________________________________________________________________
	
	
	@BeforeClass
	public static void firstInstantiateModuleForTest()
	{
		       	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				userDAO = (UserDAO)context.getBean("userDAO");	

				System.out.println(" We are inside Before Class intantiated object!!"+userDAO);
			    //User user=(User)context.getBean("user");			
	}
	
//________________________________________________________________________________________________________________

	
// Test 1: ___________ADDING ' SINGLE ' USER_______________
@Ignore
@Test
	public void addingUserTest()
	{
				 User user = new User();
				  user.setUserName("Jill");
				  user.setUserPassword("abc");
				  user.setEnabled(false);
				  user.setUserRole("CUSTOMER_ROLE");
				  user.setEmailId("jill@gmail.com");
				  user.setMobileNum("6666655555");
				  user.setUserAddress("Tokyo");
				  user.setCustomerName("Jill Mills");
		          assertTrue("Problem in User Insertion into the H2 Database", userDAO.addingUser(user));
	}
	
	
// Test 2: ____________GETTING OR RETRIEVING ' SINGLE ' USER________________
@Ignore
@Test
public void gettingUserTest()
{
				assertNotNull("Problem in the User", userDAO.gettingUser(3));
}
 

// Test 3: _____________DELETING ' SINGLE ' USER________________
@Ignore
@Test
public void deletingUserTest()
{
			User user = userDAO.gettingUser(2);
			assertTrue("Problem in Deleting:" , userDAO.deletingUser(user));
}


// Test 4: ______________UPDATING ' SINGLE ' USER_______________
@Ignore
@Test
public void updateUserTest()
{
			User user = userDAO.gettingUser(1);
			user.setUserName("Monty");
			user.setUserPassword("123");
			assertTrue("Problem in Updation of User Table", userDAO.updatingUser(user));
}


// Test 5: _______________RETRIEVING THE ' ENTIRE ' USER RECORD________________
@Ignore
@Test
public void listUsersTest()
{
			List<User> listUsers = userDAO.gettingUsers();
			assertNotNull("No Users Exist!!", listUsers);
			
			for(User user:listUsers)
			{
				   //System.out.print(user.getUserId() + "  :::  ");
				   System.out.print(user.getUserName() + "  :::  ");
				   System.out.println(user.getUserRole());
			}
}

}