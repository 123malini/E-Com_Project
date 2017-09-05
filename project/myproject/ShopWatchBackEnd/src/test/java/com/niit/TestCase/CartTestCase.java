package com.niit.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShopWatchBackEnd.dao.CartDao;
import com.niit.ShopWatchBackEnd.dao.UserDao;
import com.niit.ShopWatchBackEnd.model.Cart;
import com.niit.ShopWatchBackEnd.model.User;



public class CartTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static CartDao cartdao;
	@Autowired
	static UserDao userdao;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		cartdao = (CartDao) context.getBean("cartdao");
		userdao = (UserDao) context.getBean("userdao");
	}

	@Test
	public void register() {
		User user = new User();
		user.setUserName("ABC");
		user.setEmailId("abc@g.c");
		user.setContactNo("9801907856");
		user.setRole("Customer");
		if(userdao.insertUser(user))
		{
			Cart cart=new Cart();
			cart.setTotalitem(0);
			cart.setTotalprice(0);
	
cart.setUser(user);
Assert.assertEquals(true, cartdao.insertItem(cart));
			
		}
	}
	/*
	 * @Test public void deleteeCart() { Cart cart =cartdao.getbyId(152);
	 * Assert.assertEquals(true, cartdao.deleteItem(cart));
	 * 
	 * }
	 */
}
