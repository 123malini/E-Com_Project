package com.niit.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShopWatchBackEnd.dao.UserDao;
import com.niit.ShopWatchBackEnd.model.User;

public class UserTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static UserDao userdao;
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		userdao= (UserDao)context.getBean("userdao");
	}
	@Test
	public void createUser()
	{
		User user=new User();
		user.setUserName("ABC");
		user.setEmailId("@123");
		user.setContactNo("9801907856");
		user.setRole("Customer");
		user.setPassword("werty");
		Assert.assertEquals(true,userdao.insertUser(user));
	}
}

    
    
   

