package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.repo.OrdersRepository;

@Service
public class OrderService {

	@Autowired
	private OrdersRepository orderRepository;
	
	public List<Orders> searchByCustomerId(int custId) {
		return orderRepository.findByCusId(custId);
	}
}
