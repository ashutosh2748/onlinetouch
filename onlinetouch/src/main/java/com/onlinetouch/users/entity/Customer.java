package com.onlinetouch.users.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Customer extends WebUser {
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinTable(name = "Customer_Shipping_Address",
		joinColumns = { @JoinColumn(name = "webuser_id") },
		inverseJoinColumns = { @JoinColumn(name = "address_id") }
	)
	private ArrayList<Address> shippingAddress = new ArrayList<Address>();
	
	@OneToMany(cascade= CascadeType.ALL)
	private ArrayList<PaymentMethod> paymentMethods = new ArrayList<PaymentMethod>();
	
}
