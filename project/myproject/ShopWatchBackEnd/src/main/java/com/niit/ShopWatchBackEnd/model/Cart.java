package com.niit.ShopWatchBackEnd.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cartId;
private int totalitem;
private double totalprice;
@OneToMany(fetch=FetchType.EAGER, mappedBy="cart")
private Set<CartItem> cartItem=new HashSet<CartItem>();
public Set<CartItem> getCartItem() {
	return cartItem;
}
public void setCartItem(Set<CartItem> cartItem) {
	this.cartItem = cartItem;
}
@OneToOne
private User user;
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getTotalitem() {
	return totalitem;
}
public void setTotalitem(int totalitem) {
	this.totalitem = totalitem;
}
public double getTotalprice() {
	return totalprice;
}
public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
