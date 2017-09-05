package com.niit.ShopWatchBackEnd.dao;

import java.util.List;

import com.niit.ShopWatchBackEnd.model.CartItem;

public interface CartItemDao {
	
		boolean insert(CartItem cart);
		boolean update(CartItem cart);
		boolean delete(CartItem cart);
		List<CartItem> getAll();
		CartItem getById(int id);

}