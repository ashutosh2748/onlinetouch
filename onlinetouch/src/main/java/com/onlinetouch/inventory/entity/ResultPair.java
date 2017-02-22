package com.onlinetouch.inventory.entity;

public class ResultPair {
	Product product;
	long availableCount;
	
	public ResultPair(Product product, long availableCount) {
		super();
		this.product = product;
		this.availableCount = availableCount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public long getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(long availableCount) {
		this.availableCount = availableCount;
	}

}
