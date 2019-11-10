package com.stayoh.hospitality.gateway.order;

import java.util.List;

import com.stayoh.hospitality.entity.Order;

public interface OrderGateway {

	Order save(Order order);
	
	Order find(Long oid);
	
	List<Order> findAll();
	
	Integer delete(Long oid);
}
