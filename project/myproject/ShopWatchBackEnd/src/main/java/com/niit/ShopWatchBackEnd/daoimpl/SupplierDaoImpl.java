package com.niit.ShopWatchBackEnd.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShopWatchBackEnd.dao.SupplierDao;
import com.niit.ShopWatchBackEnd.model.Supplier;


@Repository("supplierdao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {
@Autowired
SessionFactory sessionFactory;
	public boolean insertSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
	try {
		sessionFactory.getCurrentSession().save(supplier);
		return true;
	}
	catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}

	public Supplier getbyId(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Supplier.class,id );
	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		}
	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		}
		
}
