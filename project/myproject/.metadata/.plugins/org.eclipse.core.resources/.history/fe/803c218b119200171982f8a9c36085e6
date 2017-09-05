package com.niit.ShopWatchBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShopWatchBackEnd.dao.CartDao;
import com.niit.ShopWatchBackEnd.model.Cart;
import com.niit.ShopWatchBackEnd.model.Product;

@Transactional
@Repository("cartdao")
public class CartDaoImpl implements CartDao {
	@Autowired
	SessionFactory sessionFactory;

	public boolean insertItem(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (Exception e) {
			return false;

		}
	}
	public boolean deleteItem(Cart cart) {
		// TODO Auto-generated method stub
		 try{
			 sessionFactory.getCurrentSession().delete(cart);
			 return true;
		 }
		 catch(Exception e){return false;}
	}
	public Cart getbyId(int id) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().get(Cart.class,id);
	}
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return (List<Cart>)sessionFactory.getCurrentSession().createQuery("from cart").getResultList();
	}
	
	
}
