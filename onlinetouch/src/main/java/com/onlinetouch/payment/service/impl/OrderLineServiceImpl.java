package com.onlinetouch.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinetouch.payment.entity.OrderLine;
import com.onlinetouch.payment.repository.OrderLineRepository;
import com.onlinetouch.payment.service.OrderLineService;

@Service
@Transactional
public class OrderLineServiceImpl implements OrderLineService {

	@Autowired
	private OrderLineRepository orderLineRepository;
	
	@Override
	public void addOrderLine(OrderLine orderLine) {
		orderLineRepository.save(orderLine);
	}

	@Override
	public List<OrderLine> getAllOrderLine() {
		return (List<OrderLine>)orderLineRepository.findAll();
	}

	@Override
	public OrderLine getOrderLineById(Long id) {
		return orderLineRepository.findOne(id);
	}

	@Override
	public void removeOrderLine(Long id) {
		orderLineRepository.delete(id);
	}

	@Override
	public OrderLine findByProductId(long id) {
		return orderLineRepository.findByProductId(id);
	}

}
