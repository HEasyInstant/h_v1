package com.stayoh.hospitality.usecase.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stayoh.hospitality.entity.Order;
import com.stayoh.hospitality.gateway.order.OrderGateway;

@Service
public class OrderUseCaseImpl implements OrderUseCase {

	@Autowired
	private OrderGateway gateway;
	
	@Override
	public Order save(Order order) {
		return gateway.save(order);
	}

	@Override
	public Order find(Long oid) {
		return gateway.find(oid);
	}

	@Override
	public List<Order> findAll() {
		return gateway.findAll();
	}

	@Override
	public Integer delete(Long oid) {
		return gateway.delete(oid);
	}

}
