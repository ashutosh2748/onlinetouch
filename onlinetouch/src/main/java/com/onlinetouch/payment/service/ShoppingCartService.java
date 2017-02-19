package com.onlinetouch.payment.service;

import java.util.List;

import com.onlinetouch.payment.entity.ShoppingCart;

public interface ShoppingCartService {
	public ShoppingCart getById(Long id);

	public List<ShoppingCart> getAll();

	public void saveShoppingCart(Long productId);

	public void deleteShoppingCart(ShoppingCart shoppingCart);

	public ShoppingCart findByTotalPrice();

	public ShoppingCart findByOrderId(Long id);

	public void deleteAllCart();

	public double findTotalCartCost(List<ShoppingCart> shoppingCarts);

}
