package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer searchByCustomerId(int id) {
		return customerRepository.findById(id).get();
	}
	
	public Customer login(String user, String pwd) {
		return customerRepository.findByCusUserNameAndCusPassword(user, pwd);
	}
}
