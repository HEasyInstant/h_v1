package com.stayoh.hospitality.gateway.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stayoh.hospitality.entity.Order;
import com.stayoh.hospitality.repository.OrderRepository;

@Service
public class OrderGatewaySql implements OrderGateway{

	@Autowired
	private OrderRepository repository;
	
	@Override
	public Order save(Order order) {
		return repository.save(order);
	}

	@Override
	public Order find(Long oid) {
		return repository.findById(oid).orElse(null);
	}

	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}

	@Override
	public Integer delete(Long oid) {
		try {
			repository.deleteById(oid);
		}catch(Exception e) {
			return 0;
		}
		return 1;
	}

}
