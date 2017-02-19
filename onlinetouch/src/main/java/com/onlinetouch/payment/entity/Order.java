package com.onlinetouch.payment.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private Date orderDate;
	private Date shipDate;
	@ManyToOne(cascade= CascadeType.ALL)
	private WebUser user;
	@OneToOne(cascade= CascadeType.ALL)
	private ShippingInfo info;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public WebUser getUser() {
		return user;
	}
	public void setUser(WebUser user) {
		this.user = user;
	}
	public ShippingInfo getInfo() {
		return info;
	}
	public void setInfo(ShippingInfo info) {
		this.info = info;
	}
	
}

