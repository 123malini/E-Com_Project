package com.niit.ShopWatchBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShopWatchBackEnd.dao.CartItemDao;
import com.niit.ShopWatchBackEnd.model.CartItem;
@Repository("cartitemdao")
@Transactional
public class CartItemDaoImpl implements CartItemDao{
	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(CartItem cart) {
		 try{
			 sessionFactory.getCurrentSession().save(cart);
			 return true;
		 }catch(Exception e){return false;}
	}


	public boolean update(CartItem cart) {
		 try{
			 sessionFactory.getCurrentSession().update(cart);
			 return true;
		 }catch(Exception e){return false;}
	}

	public boolean delete(CartItem cart) {
		 try{
			 sessionFactory.getCurrentSession().delete(cart);
			 return true;
		 }catch(Exception e){return false;}
	}


	public List<CartItem> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from AddtoCart").getResultList();
	}

	public CartItem getById(int id) {
		// TODO Auto-generated method stub
		return (CartItem)sessionFactory.getCurrentSession().get(CartItem.class, id);
	}

}
