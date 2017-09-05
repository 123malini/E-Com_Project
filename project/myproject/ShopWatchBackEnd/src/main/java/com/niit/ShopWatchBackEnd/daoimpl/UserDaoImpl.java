package com.niit.ShopWatchBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShopWatchBackEnd.dao.UserDao;
import com.niit.ShopWatchBackEnd.model.User;
@Repository("user1")
@Transactional


public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	
	
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		try{
			 sessionFactory.getCurrentSession().save(user);
			return true; 
		 }
		 catch(Exception e){
			 return false; 
		 }
	}


	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public User getById(int id) {
		
		return (User)sessionFactory.getCurrentSession().get(User.class,id);
	}
 

}