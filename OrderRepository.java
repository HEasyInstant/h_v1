package com.stayoh.hospitality.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stayoh.hospitality.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
