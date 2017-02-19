package com.onlinetouch.payment.service;

import java.util.List;

import com.onlinetouch.payment.entity.OrderLine;


public interface OrderLineService {

	public void addOrderLine(OrderLine OrderLine);
	public List<OrderLine> getAllOrderLine();
	public OrderLine getOrderLineById(Long id);
	public void removeOrderLine(Long id);
	public OrderLine findByProductId(long id);
}
