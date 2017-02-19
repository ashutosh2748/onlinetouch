package com.onlinetouch.payment.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.onlinetouch.payment.type.ShippingType;

@Entity
public class ShippingInfo {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	@Enumerated(EnumType.ORDINAL)
	private ShippingType shippingType;
	private double shippingCost;
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
}