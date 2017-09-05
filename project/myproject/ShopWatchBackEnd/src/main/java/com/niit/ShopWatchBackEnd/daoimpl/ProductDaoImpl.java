package com.niit.ShopWatchBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShopWatchBackEnd.dao.ProductDao;
import com.niit.ShopWatchBackEnd.model.Product;


@Repository("productdao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean insertProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	public Product getbyId(int id) {
		// TODO Auto-generated method stub
		
	return sessionFactory.getCurrentSession().get(Product.class,id);
}

	

	public boolean updateProduct(Product productupdate) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(productupdate);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

	public boolean deleteProduct(Product productdelete) {
		// TODO Auto-generated method stub
		 try{
			 sessionFactory.getCurrentSession().delete(productdelete);
			 return true;
		 }
		 catch(Exception e){return false;}
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>)sessionFactory.getCurrentSession().createQuery("from Product").getResultList();
	}
	
}
