package com.onlinetouch.users.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer extends WebUser {
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinTable(name = "Customer_Shipping_Address",
		joinColumns = { @JoinColumn(name = "webuser_id") },
		inverseJoinColumns = { @JoinColumn(name = "address_id") }
	)
	private ArrayList<Address> shippingAddress = new ArrayList<Address>();
	
	@OneToOne(cascade= CascadeType.ALL)
	private Address billingAddress;
	
	@OneToMany(cascade= CascadeType.ALL)
	private Payment payment;
	
	
	@OneToMany(mappedBy = "customer", cascade= CascadeType.ALL)
	private ArrayList<Payment> payments = new ArrayList<Payment>();
	
}
