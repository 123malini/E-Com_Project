package com.niit.ShopWatchBackEnd.dao;

import java.util.List;

import com.niit.ShopWatchBackEnd.model.Product;

public interface ProductDao {
	boolean insertProduct(Product product); 
	Product getbyId(int id);
	boolean updateProduct(Product productupdate);
	boolean deleteProduct(Product productdelete);
	 List<Product> getAll();
	}
