package com.onlinetouch.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetouch.payment.entity.ShoppingCart;
import com.onlinetouch.payment.service.ShoppingCartService;
import com.onlinetouch.users.service.WebUserService;


@RestController
public class ShoppingCartController {

	@Autowired
	ShoppingCartService shoppingCartService;
	@Autowired
	WebUserService webUserService;
	
	@RequestMapping(value = "/cartList", method = RequestMethod.GET)
	public String getCartList(Model model) {
		List<ShoppingCart> shoppingCart = shoppingCartService.getAll();
		model.addAttribute("shoppingCarts", shoppingCart);
		double totalPrice = shoppingCartService.findTotalCartCost(shoppingCart);
		model.addAttribute("totalPrice", totalPrice);
		return "cartList";
	}
}
