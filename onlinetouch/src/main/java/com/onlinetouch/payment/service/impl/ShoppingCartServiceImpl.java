package com.onlinetouch.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinetouch.payment.entity.ShoppingCart;
import com.onlinetouch.payment.repository.ShoppingCartRepository;
import com.onlinetouch.payment.service.ShoppingCartService;

@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Override
	public ShoppingCart getById(Long id) {
		return shoppingCartRepository.findOne(id);
	}

	@Override
	public List<ShoppingCart> getAll() {
		return (List<ShoppingCart>)shoppingCartRepository.findAll();
	}

	@Override
	public void saveShoppingCart(Long productId) {
		
	}
	
	@Transactional
	public void addCart(ShoppingCart shoppingCart){
		shoppingCartRepository.save(shoppingCart);
	}
	
	@Override
	public void deleteShoppingCart(ShoppingCart shoppingCart) {
		shoppingCartRepository.delete(shoppingCart);
	}

	@Override
	public ShoppingCart findByTotalPrice() {
		return shoppingCartRepository.findByTotalPrice();
	}

	@Override
	public ShoppingCart findByOrderId(Long id) {
		return  shoppingCartRepository.findByOrderId(id);
	}

	@Override
	public void deleteAllCart() {
		shoppingCartRepository.deleteAll();
	}

	@Override
	public double findTotalCartCost(List<ShoppingCart> shoppingCarts) {
		double totalPrice = 0;
		for(ShoppingCart sc : shoppingCarts){
			totalPrice += sc.getTotalPrice();
		}
		return totalPrice;
	}

}
