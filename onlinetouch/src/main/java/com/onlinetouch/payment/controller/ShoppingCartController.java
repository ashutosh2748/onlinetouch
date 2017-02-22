package com.onlinetouch.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/carts",
			method = RequestMethod.GET)
	public ResponseEntity<String> getCartList(Model model) {
		List<ShoppingCart> shoppingCart = shoppingCartService.getAll();
		if(shoppingCart == null)
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		model.addAttribute("shoppingCarts", shoppingCart);
		double totalPrice = shoppingCartService.findTotalCartCost(shoppingCart);
		model.addAttribute("totalPrice", totalPrice);
		return new ResponseEntity<String>("carts", HttpStatus.OK);
	}
	
	
	  //------------------- Update a Cart --------------------------------------------------------
    
    @RequestMapping(value = "/shoppingCart/{productId}",
    		method = RequestMethod.PUT,
    		consumes = MediaType.APPLICATION_JSON_VALUE,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShoppingCart> updateUser(@PathVariable("productId") long id, @RequestBody ShoppingCart cart) {
        System.out.println("Updating cart " + id);
          
        ShoppingCart currentCart = shoppingCartService.findByOrderId(id);
          
        if (currentCart == null) {
            System.out.println("Cart with id " + id + " not found");
            return new ResponseEntity<ShoppingCart>(HttpStatus.NOT_FOUND);
        }
  
//        currentCart.setOrder(cart.getOrder());;
//        currentCart.setAddedDate(cart.getAddedDate());;
//        currentCart.setQuantity(cart.getQuantity());
          
        shoppingCartService.saveShoppingCart(id);
        return new ResponseEntity<ShoppingCart>(currentCart, HttpStatus.NO_CONTENT);
    }
	
}
