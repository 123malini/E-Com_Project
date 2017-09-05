package com.niit.ShopWatchBackEnd.dao;

import java.util.List;

import com.niit.ShopWatchBackEnd.model.User;

public interface UserDao {
	 boolean insertUser(User user);
     
     List<User> getAll();
    
}
