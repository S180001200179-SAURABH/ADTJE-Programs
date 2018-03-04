package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDAO
{
			public boolean addingUser(User user);
			public boolean updatingUser(User user);
			public User gettingUser(int userId);
			public List<User> gettingUsers();
			public boolean deletingUser(User user);	
}
