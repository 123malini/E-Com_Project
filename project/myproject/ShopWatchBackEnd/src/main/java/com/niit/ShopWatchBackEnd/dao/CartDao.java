package com.niit.ShopWatchBackEnd.dao;

import java.util.List;

import com.niit.ShopWatchBackEnd.model.Cart;
import com.niit.ShopWatchBackEnd.model.Product;

public interface CartDao {
boolean insertItem(Cart cart);
boolean deleteItem(Cart cart); 
Cart getbyId(int id);
List<Cart> getAll();
}

